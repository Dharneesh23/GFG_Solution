// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        if(arr.length==0||arr.length<2)
        {
            return 0;
        }
        return sort(arr,0,arr.length-1);
        
    }
    static int sort(int[] arr,int left,int right)
    {
        int count =0;
        if(left<right)
        {
            int mid = left+(right-left)/2;
            count+=sort(arr,left,mid);
            count+=sort(arr,mid+1,right);
            count+=merge(arr,left,mid,right);
        }
        return count;
    }
    static int merge(int[]arr,int left,int mid,int right)
    {
        int[]leftarr = new int[mid-left+1];
        int[]rightarr = new int[right-mid];
        for(int i=0;i<leftarr.length;i++)
        {
            leftarr[i] = arr[left+i];
        }
        for(int j=0;j<rightarr.length;j++)
        {
            rightarr[j] = arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k = left;
        int count =0;
        while(i<leftarr.length&&j<rightarr.length)
        {
            if(leftarr[i]<=rightarr[j])
            {
                arr[k] = leftarr[i];
                k++;
                i++;
            }else{
                arr[k] = rightarr[j];
                k++;
                j++;
                count+=leftarr.length-i;
            }
        }
        while(i<leftarr.length)
        {
           arr[k] = leftarr[i];
           k++;
           i++;
        }
        while(j<rightarr.length)
        {
            arr[k] = rightarr[j];
            k++;
            j++;
        }
        return count;
    }
}