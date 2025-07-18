class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        return list;
        
    }
}