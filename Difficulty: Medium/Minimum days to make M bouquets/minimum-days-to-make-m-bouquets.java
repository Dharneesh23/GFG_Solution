// User function Template for Java

class Solution {
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        int n = arr.length;
        if((long)m*k>n)
        {
            return -1;
        }
        int left =1;
        int right = 0;
        int ans = -1;
        for(int day:arr)
        {
            right = Math.max(right,day);
        }
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(cal(arr,m,k,mid))
            {
                ans = mid;
                right = mid-1;
            }else{
                left =  mid+1;
            }
        }
        return ans ;
        
    }
    public static boolean cal(int[]arr,int m,int k , int mid)
    {
        int boq =0;
        int flower =0;
        for(int day:arr)
        {
            if(day<=mid)
            {
                flower++;
                if(flower==k)
                {
                    boq++;
                    flower=0;
                }
            }else{
                flower=0;
            }
        }
        return boq>=m;
    }
}