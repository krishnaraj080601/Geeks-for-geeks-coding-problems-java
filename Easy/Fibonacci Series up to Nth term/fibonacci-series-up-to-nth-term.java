//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans[] = obj.Series(n);
            for (long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    long[] Series(int N) {
        // code here
        long[] a=new long[N+1];
        a[0]=0;
        a[1]=1;
        int j=2;
        fib(a,N,j);
        return a;
        
    }
   static void fib(long [] A,int n,int J)
   { 
       if(J>n){
           return;
       }
       
           A[J]=A[J-1]+A[J-2];
       

       fib (A,n,J+1);
        
    }
    
}