class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1;
        int sec =  -1;
        for(int num : arr)
        {
            if(first<num)
            {
                sec = first;
                first = num;
            }else if(num>sec&&num!=first)
            {
                sec = num;
            }
        
        }
        return sec;
    }
}