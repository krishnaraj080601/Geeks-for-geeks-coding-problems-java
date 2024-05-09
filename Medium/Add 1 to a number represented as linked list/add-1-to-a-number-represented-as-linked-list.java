//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends




/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        ArrayList<Integer> x = new ArrayList<>();
        Node temp = head;
        int count = 0;
        
        // Populate ArrayList with node data
        while (temp != null) {
            x.add(temp.data);
            temp = temp.next;
            count++;
        }
        
        int carry = 1; // Initialize carry to 1 for adding 1
        
        // Process digits and update ArrayList
        for (int i = count - 1; i >= 0; i--) {
            int sum = x.get(i) + carry;
            x.set(i, sum % 10); // Update the digit with the new value
            carry = sum / 10; // Update carry
            
            if (carry == 0) {
                break; // If no carry, no need to continue
            }
        }
        
        // Handle remaining carry
       
        
        // Update linked list nodes with new values
        temp = head;
        for (int i = 0; i < count; i++) {
            temp.data = x.get(i);
            temp = temp.next;
        }
         if (carry > 0) {
            Node newHead = new Node(carry);
            newHead.next = head;
            head = newHead;
        }
        
        return head;
    }
}
        


