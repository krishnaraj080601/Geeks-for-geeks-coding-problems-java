//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToPre(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
      static boolean operator(char ch){
        switch(ch){
            case '*':
            case '+':
            case '-':
            case '/':
            case '^':
            return true;
        }
        return false;
    }
    static String postToPre(String post_exp) {
        // code here
        String r=new String("");
        Stack<String> x=new Stack<>();
        for(int i=0;i<post_exp.length();i++){
            char ch=post_exp.charAt(i);
        if(operator(ch)){
            String r1=x.pop();
            String r2=x.pop();
            r=ch+r2+r1;
            x.push(r);
        }
        else{
            x.push(ch+"");
        }
        }
        return x.pop();
    }
}
