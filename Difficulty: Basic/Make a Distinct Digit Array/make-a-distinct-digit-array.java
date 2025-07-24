// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums)
        {
            while(n!=0)
            {
                int digit = n%10;
                set.add(digit);
                n/=10;
            }
        }
        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
      //  Collections.sort(set);
        int[]arr = new int[ans.size()];
        
        for(int i=0;i<ans.size();i++)
        {
            arr[i] = ans.get(i);
            
        }
        return arr;
        
    }
}