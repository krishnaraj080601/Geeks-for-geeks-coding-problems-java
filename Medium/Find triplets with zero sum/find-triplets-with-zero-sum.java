//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
       
         // Iterate through the array elements to form triplets
        for (int i = 0; i < n - 1; i++) {
            // Create a HashSet to store elements we've seen so far
            HashSet<Integer> hashSet = new HashSet<>();
            
            // Fix the first element as arr[i]
            int currSum = -arr[i];
            
            // Check if the current sum can be achieved with any pair of elements
            for (int j = i + 1; j < n; j++) {
                // Calculate the required sum for the pair
                int requiredSum = currSum - arr[j];
                
                // If the required sum exists in the hash set, we found a triplet
                if (hashSet.contains(requiredSum)) {
                    return true;
                }
                
                // Add the current element to the hash set
                hashSet.add(arr[j]);
            }
        }
        
        // If no triplet found then return false
        return false;
    }
}