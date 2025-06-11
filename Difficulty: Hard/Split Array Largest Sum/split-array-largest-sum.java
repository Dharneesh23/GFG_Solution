class Solution {
    static int splitArray(int[] arr, int N, int K) {
        // code here
        if(arr.length<K)
        {
            return -1;
        }
        if(K==1)
        {
            return arrTol(arr);
        }
        int left = arrMax(arr);
        int right = arrTol(arr);
        while(left<=right)
        {
            int mid = (left+right)/2;
            int split = cal(arr,mid);
            if(split>K)
            {
                left = mid+1;
            }else{
                right = mid-1;
            }
            
        }
        return left;
    }
    static int arrMax(int[]arr)
    {
        int max =0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    static int arrTol(int[]arr)
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        return total;
    }
    static int cal(int[]arr,int mid)
    {
        int spl = 1;
        int curr = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(curr+arr[i]<=mid)
            {
                curr+=arr[i];
            }else{
                spl++;
                curr = arr[i];
            }
        }
        return spl;
    }
}