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
            String ans = obj.postToInfix(s);
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
    static String postToInfix(String exp) {
        // code here
        String r=new String("");
        Stack<String>s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(operator(ch)){
                String s1=s.pop();
                String s2=s.pop();
                r="("+s2+ch+s1+")";
                s.push(r);
            }
            else{
                s.push(ch+"");
            }
        }
        return s.pop();
    }
}
