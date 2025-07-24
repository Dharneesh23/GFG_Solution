class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer>odd =  new ArrayList<>();
        ArrayList<Integer>even = new ArrayList<>();
      //  int[]ans = new int[arr.length];
        for(int n : arr)
        {
            if(n%2==0)
            {
                even.add(n);
            }else{
                odd.add(n);
            }
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        int index =0;
        for(int i : odd)
        {
           arr[index] = i;
           index++;
        }
        for(int i : even)
        {
            arr[index] = i;
            index++;
        }
        
    }
}
