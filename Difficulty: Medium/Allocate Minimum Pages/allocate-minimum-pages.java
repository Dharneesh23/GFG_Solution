
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k)
        {
            return -1;
        }
        if(k==1)
        {
            return arrTol(arr);
        }
       int left = arrMax(arr);
       int right = arrTol(arr);
       while(left<=right)
       {
           int mid = (left+right)/2;
           int nostd = cal(arr,mid);
           if(nostd>k)
           {
               left = mid+1;
           }else{
               right =mid-1;
           }
           
           
       }
       return left;
       
        
    }
    public static int arrMax(int[]arr)
    {
        int max =0;
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(arr[i],max);
        }
        return max;
    }
    public static int arrTol(int[]arr)
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        return total;
    }
    public static int cal(int[]arr,int mid)
    {
        int std =1;
        int currpage =0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(currpage+arr[i]<=mid)
            {
                currpage+=arr[i];
            }else{
                std++;
                currpage = arr[i];
            }
        }
        return std;
    }
}