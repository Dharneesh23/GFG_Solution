class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int pivot = -1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pivot = i;
                break;
            }
        }
        if(pivot ==-1)
        {
            Arrays.sort(arr);
            return;
        }
        for(int i=arr.length-1;i>pivot;i--)
        {
            if(arr[i]>arr[pivot])
            {
                swap(arr,pivot,i);
                break;
            }
        }
        reverse(arr,pivot+1,arr.length-1);
    }
      public void swap(int[]arr,int start,int end)
    {
        
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        
    }
    public void reverse(int[]arr,int start,int end)
    {
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

}