class Solution {
  public:
    int sumOfDigits(int n) {
        // code here
        int sum =0;
        while(n!=0)
        {
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
};