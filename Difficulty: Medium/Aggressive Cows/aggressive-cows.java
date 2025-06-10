// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int left =0;
        int right = stalls[stalls.length-1]-stalls[0];
        int ans = 0;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(cal(stalls,k,mid))
            {
                ans = mid;
                left=mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static boolean cal(int[]arr,int k,int mid)
    {
        int count =1;
        int laspos = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-laspos>=mid)
            {
                count++;
                laspos = arr[i];
            }
        }
        if(count>=k)
        {
            return true;
        }
        return false;
    }
}