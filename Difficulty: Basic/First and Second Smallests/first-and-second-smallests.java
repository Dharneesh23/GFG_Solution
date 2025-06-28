class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int min =Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                smin = min;
                min = arr[i];
            }else if(arr[i]>min && arr[i]<smin)
            {
                smin = arr[i];
            }
        }
        if(smin==Integer.MAX_VALUE)
        {
            list.add(-1);
            //list.add(-1);
        }else{
            list.add(min);
            list.add(smin);
        }
        return list;
    }
}
