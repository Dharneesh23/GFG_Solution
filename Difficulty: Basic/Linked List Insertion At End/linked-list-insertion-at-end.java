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
class Solution {
    public Node insertAtEnd(Node head, int x)  {
        // code here
        Node n = new Node(x);
        Node temp = head;
        if(head==null)
        {
            return n;
        }
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }
}