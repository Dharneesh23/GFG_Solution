class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,List<String>> map = new HashMap<>();
         ArrayList<ArrayList<String>> result = new ArrayList<>();
        for(String s : arr)
        {
            char[]a = s.toCharArray();
            Arrays.sort(a);
            String s1 = String.valueOf(a);
            if(!map.containsKey(s1))
            {
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(s);
            
        }
        for (List<String> group : map.values()) {
            result.add(new ArrayList<>(group)); // Explicitly convert to ArrayList<String>
        }

        return result;
    }
}
