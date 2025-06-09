// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int left =1;
        int right = m ;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int pow = pow(mid,n);
            if(pow==m)
            {
                return mid;
            }else if(pow>m)
            {
                right = mid-1;
            }else{
                left = mid+1;
            }
            
        }
        return -1;
        
    }
    public int pow(int mid,int n)
    {
        int k =1;
        for(int i=1;i<=n;i++)
        {
            k*=mid;
        }
        return k;
    }
}