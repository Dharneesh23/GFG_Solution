class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet())
        {
            if(map.get(i)>nums.length/3)
            {
                list.add(i);
            }
        }
        return list;
    }
}
