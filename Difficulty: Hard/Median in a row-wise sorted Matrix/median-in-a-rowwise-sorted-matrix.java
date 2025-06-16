// User function Template for Java

class Solution {
    int median(int mat[][]) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int[] arr = new int[row*col];
        int index =0;
        for(int []num: mat)
        {
            for(int n:num)
            {
                arr[index] = n;
                index++;
            }
        }
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}