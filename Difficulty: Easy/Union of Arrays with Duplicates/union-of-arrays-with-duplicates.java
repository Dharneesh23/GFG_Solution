// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer>set = new HashSet<>();
        for(int n : a)
        {
            set.add(n);
        }
        for(int n : b)
        {
            set.add(n);
        }
        return set.size();
    }
}