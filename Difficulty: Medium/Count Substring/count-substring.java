class Solution {
    public static int countSubstring(String s) {
        // code here
        int ans =0;
        int start =0;
        int[]arr = new int[3];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        
        while(arr[0]>0&&arr[1]>0&&arr[2]>0)
        {
            ans+=s.length()-i;
            arr[s.charAt(start)-'a']--;
            start++;
        
          }
        }
        return ans;
    }
}
