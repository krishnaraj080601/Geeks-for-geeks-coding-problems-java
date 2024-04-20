//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
            if(arr[low]<min){
                min=arr[low];
                index=low;
            }
            break;
            }
            if(arr[low]<=arr[mid]){
                 if(arr[mid]<min){
                min=arr[mid];
                index=mid;
            }
                low=mid+1;
                
            }
            else{
                if(arr[mid]<min){
                min=arr[mid];
                index=mid;
            }
            high=mid-1;
            }
            
          
    }
    return index;
}
    
}