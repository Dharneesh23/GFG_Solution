

class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        // your code here
       int sum =0;
       String num ="";
       for(int i=0;i<s.length();i++)
       {
           if(Character.isDigit(s.charAt(i)))
           {
               num+=s.charAt(i);
               
           }else{
               if(!num.equals(""))
               sum += Integer.parseInt(num);
               num = "";
           }
       }
        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }
       return sum;
    }
}