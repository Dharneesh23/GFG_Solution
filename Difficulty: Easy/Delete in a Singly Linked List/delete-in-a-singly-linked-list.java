/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x==1)
        {
            return head.next;
        }
        Node curr = head;
        for(int i=1;i<x-1&&curr!=null;i++)
        {
            curr = curr.next;
        }
        if(curr.next!=null&&curr!=null)
        {
            curr.next = curr.next.next;
        }
        return head;
    }
}