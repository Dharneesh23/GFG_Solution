class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char[]a1 = s1.toCharArray();
        char[]a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}