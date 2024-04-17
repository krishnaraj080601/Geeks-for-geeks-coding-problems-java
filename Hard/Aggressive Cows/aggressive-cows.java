//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean place (int []arr,int j, int k){
        int x=arr[0];
        int count=1;
        for(int z=0;z<arr.length;z++){
            if(arr[z]-x>=j){
                count++;
                x=arr[z];
            }
            if(count>=k){
            return true;
        }
        }
        
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        int low=1;
        Arrays.sort(stalls);
        int high=stalls[n-1];
       while(low<=high){
           int mid=(low+high)/2;
           if(place(stalls,mid,k)==false){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        return high;
    }
}