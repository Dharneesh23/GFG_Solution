// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        int n =  arr.length;
        int max = -1;
        for(int i=n-1;i>=0;i--)
        {
            int curr = arr[i];
            list.add(0,max);
            if(curr>max)
            {
                max = curr;
            }
        }
        return list;
    }
}