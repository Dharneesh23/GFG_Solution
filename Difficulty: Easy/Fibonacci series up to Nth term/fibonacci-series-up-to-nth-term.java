class Solution {
  int mod = 1000000007;
  int[]dp;
    int[] Series(int n) {
        // code here
        dp  = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i] = -1;
        }
        for(int i=0;i<=n;i++)
        {
            fib(i);
        }
        return dp;
    }
    int fib (int n)
    {
        if(n==0)
        {
            return dp[0] =0;
        }
        if(n==1)
        {
            return dp[1] =1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n] = (fib(n-1)+fib(n-2))%mod;
    }
}