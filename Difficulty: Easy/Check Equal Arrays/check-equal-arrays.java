// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // Your code here
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer>map2 = new HashMap<>();
        if(a.length!=b.length)
        {
            return false;
        }
        for(int i : a)
        {
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i : b)
        {
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        return map1.equals(map2);
        
        
    }
}