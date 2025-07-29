class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Integer key  :  map.keySet())
        {
            int s = map.get(key);
            list.add(new ArrayList<>(Arrays.asList(key,s)));
        }
        return list;
        
    }
}