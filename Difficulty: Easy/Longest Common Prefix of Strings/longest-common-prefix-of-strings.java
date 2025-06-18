// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        String s1 = arr[0];
        String s2 = arr[arr.length-1];
        String ans = "";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                ans = ans+s1.charAt(i);
            }else{
                break;
            }
        }
        return ans;
    }
}