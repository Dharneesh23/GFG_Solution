// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        HashSet<Character>set = new HashSet<>();
        for(char ch : s.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
                ans.append(ch);
            }
        }
        return String.valueOf(ans);
        
    }
}
