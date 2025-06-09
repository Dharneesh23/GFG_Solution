class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        if(arr.length>k)
        {
            return 0;
        }
        int left =1;
        int right =-1;
        for(int i=0;i<arr.length;i++)
        {
            right = Math.max(right,arr[i]);
        }
        int ans =0;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int time =0;
            for(int i=0;i<arr.length;i++)
            {
                time+=Math.ceil((double)(arr[i])/mid);
            }
            if(time>k)
            {
                left = mid+1;
            }else{
                ans = mid;
                right = mid-1;
            }
        }
    
    return ans;
    }
}
