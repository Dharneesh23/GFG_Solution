// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--)
        {
            ans=ans.append(s.charAt(i));
        }
        return String.valueOf(ans);
    }
}