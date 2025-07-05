// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        if(arr.length==0||arr==null)
        {
            return null;
        }
        Node head = new Node(arr[0]);
        Node current = head;
        int start = 1;
        while(start<arr.length)
        {
            Node newNode = new Node(arr[start]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
            start++;
            
        }
        return head;
    }
}