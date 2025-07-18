class Solution {
    public static int maxDepth(String s) {
        // code here
        int max =0;
        int curr = 0;
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                curr++;
                max = Math.max(max,curr);
            } if(c==')')
            {
                curr--;
            }
        }
        return max;
    }
}
