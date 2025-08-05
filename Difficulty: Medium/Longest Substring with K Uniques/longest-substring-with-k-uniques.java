class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
       int left =0;
       int right =0;
       int max =-1;
       HashMap<Character,Integer>map = new HashMap<>();
       if(s==null||s.length()==0||k==0)
       {
           return -1;
       }
       while(right<s.length())
       {
           char ch = s.charAt(right);
           map.put(ch,map.getOrDefault(ch,0)+1);
           while(map.size()>k)
           {
               char lch = s.charAt(left);
               map.put(lch,map.get(lch)-1);
               if(map.get(lch)==0)
               {
                   map.remove(lch);
               }
               left++;
               
           }
           if(map.size()==k)
           {
               max = Math.max(max,right-left+1);
           }
           right++;
       }
       return max;
    }
}