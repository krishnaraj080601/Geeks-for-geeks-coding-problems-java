//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
      
        Arrays.sort(arr);
        
        // Initialize the count of triplets
        int count = 0;
        
        // Fix the third element of the triplet
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = i - 1; // Pointer for the second element
            
            // Use Two Pointer approach to find pairs whose sum equals the third element
            while (left < right) {
                int sum = arr[left] + arr[right];
                
                if (sum == arr[i]) {
                    count++; // Increment the count of triplets
                    left++; // Move the left pointer forward
                } else if (sum < arr[i]) {
                    left++; // Move the left pointer forward if the sum is less than the third element
                } else {
                    right--; // Move the right pointer backward if the sum is greater than the third element
                }
            }
        }
        
        return count;
        
    }
}