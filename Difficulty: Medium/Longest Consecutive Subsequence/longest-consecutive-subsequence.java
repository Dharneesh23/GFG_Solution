class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        HashSet<Integer>set = new HashSet<>();
        int count =0;
        int max =0;
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int i : set)
        {
            if(!set.contains(i-1))
            {
                count = 1;
                int element = i;
                while(set.contains(element+1))
                {
                    count++;
                    element++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}