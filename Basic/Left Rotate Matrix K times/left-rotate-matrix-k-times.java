//{ Driver Code Starts
// Initial Template for java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            int K = Integer.parseInt(S[2]);
            int Mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    Mat[i][j] = Integer.parseInt(S1[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(N, M, K, Mat);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


// User function template for java

class Solution {
    int[][] rotateMatrix(int N, int M, int K, int Mat[][]) {
        // code here
        K=K%M;

        for(int i =0;i<N;i++){
            
            int l=0;
          
            while(l<K){
            int temp=Mat[i][0];
                
              
            for(int j=1;j<M;j++){
                  
                Mat[i][j-1]=Mat[i][j];
                
                 
            }
            Mat[i][M-1]=temp;
           
            l++;
            
            
        }
    }
    return Mat;
    }
};