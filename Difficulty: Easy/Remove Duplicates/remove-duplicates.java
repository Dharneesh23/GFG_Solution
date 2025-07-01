// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
      String ans = "";
        HashSet<Character>set = new HashSet();
        for(char c : s.toCharArray())
        {
            if(!set.contains(c))
            {
            set.add(c);
            ans+=c;
            }
        }
        return ans;
        
        
    }
}