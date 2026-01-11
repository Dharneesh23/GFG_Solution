class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int missing =-1,rep =-1;
        int[]feq = new int[n+1];
        ArrayList<Integer>list = new ArrayList<>();
        for(int num : arr)
        {
            feq[num]++;
        }
        for(int i=1;i<=arr.length;i++)
        {
            if(feq[i]==2)
            {
                rep = i;
            }
            if(feq[i]==0)
            {
                missing = i;
            }
        }
        list.add(rep);
        list.add(missing);
        return list;
    }
}
