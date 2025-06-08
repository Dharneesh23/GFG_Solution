class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int oc = 0;
        int eo= 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                eo++;
            }else{
                oc++;
            }
        }
        return new int[]{oc,eo};
    }
}