class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int zero =0;
        int one = 0;
        int two = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else{
                two++;
            }
        }
        int index =0;
        for(int i=0;i<zero;i++)
        {
            arr[index] = 0;
            index++;
        }
        for(int i=0;i<one;i++)
        {
            arr[index] = 1;
            index++;
        }
        for(int i=0;i<two;i++)
        {
            arr[index] = 2;
            index++;
        }
        
    }
}