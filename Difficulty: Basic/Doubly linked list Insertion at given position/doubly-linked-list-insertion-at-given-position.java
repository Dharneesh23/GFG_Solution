/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node newNode = new Node(x);
        Node current = head;
        for(int i=0;i<p;i++)
        {
            if(current==null)
            {
                return head;
            }
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if(current.next!=null)
        {
            current.next.prev = newNode;
        }
        current.next = newNode;
        
    
    return head;
    }
}