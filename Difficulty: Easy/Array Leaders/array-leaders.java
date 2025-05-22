class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int leader = arr[arr.length-1];
        list.add(leader);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=leader)
            {
                leader = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
