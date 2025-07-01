
class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s) {
        // Your code here
        HashMap<Character,Integer>map = new HashMap<>();
        int count =0;
        char ans = ' ';
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(char ch : c)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(count<map.get(ch))
            {
                count = map.get(ch);
                ans = ch;
            }
        }
        return ans;
    }
        
        
}