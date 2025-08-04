class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0;
        int right = arr.length-1;
        int ans =0;
        while(left<right)
        {
            int with = right-left;
            int height = Math.min(arr[left],arr[right]);
            int water = with*height;
            ans = Math.max(ans,water);
            if(arr[left]<arr[right])
            {
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}