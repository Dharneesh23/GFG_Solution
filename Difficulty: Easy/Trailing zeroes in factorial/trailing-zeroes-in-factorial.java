// User function Template for Java
class Solution {
    static int trailingZeroes(int n) {
        // Write your code here
        int count =0;
        while(n>=5)
        {
            n/=5;
            count+=n;
        }
        return count;
    }
}