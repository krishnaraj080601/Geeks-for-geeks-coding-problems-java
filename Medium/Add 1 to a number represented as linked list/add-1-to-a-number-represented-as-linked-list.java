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
        // Reverse the linked list to perform addition from the least significant digit
        head = reverse(head);

        Node current = head;
        int carry = 1; // Start with a carry of 1 (to add 1)
        while (current != null && carry > 0) {
            int sum = current.data + carry;
            current.data = sum % 10; // Update the current digit
            carry = sum / 10; // Update the carry for the next iteration
            if (carry > 0 && current.next == null) {
                // If there is a carry and we reached the last digit, add a new node
                current.next = new Node(carry);
                carry = 0; // Reset carry
            }
            current = current.next; // Move to the next digit
        }

        // Reverse the linked list back to its original order
        head = reverse(head);

        return head;
    }

    // Helper function to reverse a linked list
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev; 
  }
    
}
