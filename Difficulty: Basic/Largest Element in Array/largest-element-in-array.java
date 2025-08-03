class Solution {
    public static int largest(int[] arr) {
        // code here
        int left =0;
        int right = arr.length-1;
        int max =0;
        while(left<=right)
        {
            if(arr[left]<arr[right])
            {
                max = Math.max(max,arr[right]);
            }else{
                max = Math.max(max,arr[left]);
            }
            left++;
            right--;
        }
        return max;
    }
}
