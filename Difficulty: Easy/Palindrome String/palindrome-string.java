class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] ch = s.toCharArray();
        int left = 0;
        int right =  ch.length-1;
        while(left<right)
        {
            if(ch[left]!=ch[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}