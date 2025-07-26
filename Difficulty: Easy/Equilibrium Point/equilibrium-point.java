class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
       int total = 0;
       int leftsum =0;
       for(int n : arr)
       {
           total+=n;
       }
       for(int i=0;i<arr.length;i++)
       {
           if(leftsum==total-leftsum-arr[i])
           {
               return i;
           }
           leftsum+=arr[i];
       }
       return -1;
    }
}
