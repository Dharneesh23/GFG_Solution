class Solution {

    String maxOdd(String s) {
        // code here
        for(int i=s.length()-1;i>=0;i--)
        {
            char n = s.charAt(i);
            if((n-'0')%2==1)
            {
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}