class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int n : arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(map.getOrDefault(i+1,0));
        }
        return list;
    }
}
