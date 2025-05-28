class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<int[]>list = new ArrayList<>();
        int index =0;
        while(index<arr.length)
        {
            int start = arr[index][0];
            int currend = arr[index][1];
            while(index<arr.length-1&&currend>=arr[index+1][0])
            {
                currend = Math.max(currend,arr[index+1][1]);
                index++;
            }
            int end = currend;
            list.add(new int[]{start,end});
            index++;
        }
        return list;
        
    }
}