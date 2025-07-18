class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
      long sum =(long)(n+1)*(n+2)/2;
    long total = 0;
        for(int num : arr)
        {
            total+=num;
        }
        return (int) (sum-total);
    }
}