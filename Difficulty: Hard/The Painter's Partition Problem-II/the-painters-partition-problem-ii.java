// User function Template for Java

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
       
        if(k==1)
        {
            return arrTol(arr);
        }
        int left = arrMax(arr);
        int right = arrTol(arr);
        while(left<=right)
        {
            int mid = (left+right)/2;
            int paint = cal(arr,mid);
            if(paint>k)
            {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
    public int arrMax(int[]arr)
    {
        int max =0;
        for(int i:arr)
        {
            max = Math.max(max,i);
        }
        return max ;
    }
    public int arrTol(int[]arr)
    {
        int total = 0;
        for(int i : arr)
        {
            total+=i;
        }
        return total;
    }
    public int cal(int[]arr,int mid)
    {
        int unit = 1;
        long curr =0;
        for(int i=0;i<arr.length;i++)
        {
            if(curr+arr[i]<=mid)
            {
                curr+=arr[i];
            }else{
                unit++;
                curr = arr[i];
            }
        }
        return unit;
    }
}
