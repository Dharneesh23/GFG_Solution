class Solution {
    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character,Character>map1 = new HashMap<>();
         HashMap<Character,Character>map2 = new HashMap<>();
         for(int i=0;i<s1.length();i++)
         {
             char a = s1.charAt(i);
             char b = s2.charAt(i);
             if(map1.containsKey(a)&&map1.get(a)!=b || map2.containsKey(b)&&map2.get(b)!=a)
         {
             return false;
         }
         map1.put(a,b);
         map2.put(b,a);
             
         }
         return true;
         
        
    }
}