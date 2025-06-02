class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int left = 0;
        int right = arr.length-1;
        int ans=  arr.length;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]>target)
            {
                right= mid-1;
                ans = mid;
            }else{
                left = mid+1;
            }
        }
        return ans ;
    }
}
