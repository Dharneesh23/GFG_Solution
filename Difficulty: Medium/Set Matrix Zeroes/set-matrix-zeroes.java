//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int rowlength = mat.length;
        int collength  = mat[0].length;
        int []row = new int[rowlength];
        int[]col = new int[collength];
        for(int i=0;i<rowlength;i++)
        {
            for(int j=0;j<collength;j++)
            {
                if(mat[i][j]==0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<rowlength;i++)
        {
            for(int j=0;j<collength;j++)
            {
                if(row[i]==1||col[j]==1)
                {
                    mat[i][j] =0;
                }
            }
        }
    }
}