// User function Template for Java

class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n = stations.length;
        double low = 0.0;
        double high = 0.0;
        double esp = 1e-6;
        for(int i=0;i<n-1;i++)
        {
            high = Math.max(high,(stations[i+1]-stations[i]));
        }
        while((high-low)>esp)
        {
            double mid = (low+high)/2;
            if(check(stations,k,mid))
            {
                high = mid;
            }else{
                low = mid;
            }
        }
        return high;
    }
    public static boolean check(int[]stations,int k,double mid)
    {
        int ans =0;
        for(int i=0;i<stations.length-1;i++)
        {
            double gap = stations[i+1]-stations[i];
            ans+=(int)gap/mid;
            
        }
        return ans<=k;
    }
}
