//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<Integer>();
        int r1=0;
        int c1=0;
        while(r1<r && c1<c){
        for(int i=c1;i<c;i++)
        list.add(matrix[r1][i]);
        r1++;
            
        
        for(int i=r1;i<r;i++)
            list.add(matrix[i][c-1]);
            c--;
        
        
        if(r1<r){
            for(int i=c-1;i>=c1;i--)
                list.add(matrix[r-1][i]);
                r--;
            
        }
        if(c1<c){
            for(int i=r-1;i>=r1;i--)
                list.add(matrix[i][c1]);
                c1++;
                
            
        }
        
            
        }
        return list;
    }
}
