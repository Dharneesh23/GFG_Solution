class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int orginal = n;
        int reves = 0;
        while(n!=0)
        {
            int digit = n%10;
            reves = reves*10+digit;
            n/=10;
        }
        return orginal==reves;
        
    }
}