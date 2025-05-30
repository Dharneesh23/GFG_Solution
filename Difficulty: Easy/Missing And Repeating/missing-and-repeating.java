// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer>list = new ArrayList<>();
        int n =  arr.length;
        long nsum1 = (long)n*(n+1)/2;
        long sqsum1 = (long)n*(n+1)*(2*n+1)/6;
        long nsum2 = 0;
        long sqsum2 =0;
        for(int num : arr)
        {
            nsum2+=num;
            sqsum2+=(long)num*num;
        }
        long diff1 = nsum1-nsum2;
        long diff2 = (sqsum1-sqsum2)/diff1;
        long missing = (diff1+diff2)/2;
        long repate = missing-diff1;
        list.add((int)repate);
        list.add((int)missing);
        return list;
    }
}
