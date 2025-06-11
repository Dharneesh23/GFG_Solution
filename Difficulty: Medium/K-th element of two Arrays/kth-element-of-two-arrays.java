// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int[]arr = new int[a.length+b.length];
        int index  =0;
        for(int i=0;i<a.length;i++)
        {
            arr[index] = a[i];
            index++;
        }
        for(int i=0;i<b.length;i++)
        {
            arr[index] = b[i];
            index++;
        }
        Arrays.sort(arr);
        return arr[k-1];
        
    }
}