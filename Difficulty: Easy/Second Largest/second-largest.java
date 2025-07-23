class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max1 = 0;
        int max2 =  -1;
        for(int n : arr)
        {
            max1 = Math.max(max1,n);
        }
        for(int n : arr)
        {
            if(n!=max1)
            {
                max2 = Math.max(n,max2);
            }
        }
        return max2;
    }
}