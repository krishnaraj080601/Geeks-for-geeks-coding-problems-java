//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    static int postchar(char ch){
        switch(ch){
            case '+':
            case '-':
             return 1;
                case '*':
                case '/':
                return 2;
                case '^':
                return 3;
        }
        return -1;
        }
    
    public static String infixToPostfix(String exp) {
        // Your code here
        String result =new String("");
         Stack < Character > st = new Stack < > ();
        for(int i=0;i<exp.length();++i){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result=result+ch;
            }
            else if(ch=='('){
                st.push(ch);
                
            }
            else if(ch==')'){
                while(!st.isEmpty()&& st.peek()!='(')
                {
                    result=result+st.pop();
                
                }
                if (!st.isEmpty() && st.peek() != '(') {
                    return "Invalid Expression"; // This means there is no matching '('
                } else {
                    st.pop(); // Pop the '(' from stack
                }
                
            }
            else{
                while(!st.isEmpty()&& postchar(ch)<=postchar(st.peek())){
                    result=result+st.pop();
                    
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            if(st.peek()=='(')
            return "Invalid Expression";
            
            result=result+st.pop();
        }
        return result;
        
    }
}                                        