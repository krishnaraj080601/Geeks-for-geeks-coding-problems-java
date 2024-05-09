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

//mport java.util.ArrayList;

class Solution {
    public static Node addOne(Node head) { 
        // Convert the linked list to an ArrayList
        ArrayList<Integer> digits = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            digits.add(temp.data);
            temp = temp.next;
        }

        // Initialize carry to 1 for adding 1
        int carry = 1;
        
        // Process digits and update ArrayList
        for (int i = digits.size() - 1; i >= 0 && carry != 0; i--) {
            int sum = digits.get(i) + carry;
            digits.set(i, sum % 10); // Update the digit with the new value
            carry = sum / 10; // Update carry
        }

        // If there's a carry after adding 1, add a new node to represent it
        if (carry > 0) {
            digits.add(0, carry);
        }

        // Create a new linked list from the updated ArrayList
        Node dummy = new Node(0); // Dummy node to simplify insertion
        Node tail = dummy;
        for (int digit : digits) {
            tail.next = new Node(digit);
            tail = tail.next;
        }

        return dummy.next;
    }
}
