//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList <Integer> res=new ArrayList<>();
         int low=l;
         int x=m+1;
         while(low<=m && x<=r){
             if(arr[low]<=arr[x]){
                 res.add(arr[low]);
                 low++;
             }
             else{
                 res.add(arr[x]);
                 x++;
             }
         }
        while(low<=m){
          res.add(arr[low]);
            low++;
        }
         while(x<=r){
             res.add(arr[x]);
             x++;
         }
         int b=0;
         for(int i=l;i<=r;i++){
             arr[i]=res.get(b++);
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r) {
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
            
        }
    }
}
