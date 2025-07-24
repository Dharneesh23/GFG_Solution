class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum =0;
        int tol = 0;
        for(int n : arr)
        {
            tol+=n;
        }
        int n = arr.length;
        sum = (long)(n+1)*(n+2)/2;
        return (int)sum-tol;
    }
}