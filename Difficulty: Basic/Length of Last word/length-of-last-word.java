// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        int i = s.length()-1;
        int length = 0;
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ')
        {
            i--;
            length++;
        }
        return length;
    }
}