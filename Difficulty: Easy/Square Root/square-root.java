/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
       int left =1;
       int right = n;
       int ans= 1;
       while(left<=right)
       {
           int mid = (left+right)/2;
           if(mid*mid<=n)
           {
               ans = mid;
               left = mid+1;
           }else{
               right = mid-1;
           }
       }
       return ans;
       
    }
}