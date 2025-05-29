class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int prifix = 1;
        int suffix = 1;
        int product =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(prifix==0)
            {
                prifix = 1;
            }
            if(suffix==0)
            {
                suffix= 1;
            }
            prifix*=arr[i];
            suffix*=arr[arr.length-i-1];
            product = Math.max(prifix,product);
            product = Math.max(suffix,product);
        }
        return product;
        
    }
}