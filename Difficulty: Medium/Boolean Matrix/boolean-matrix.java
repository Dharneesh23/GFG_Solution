class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int row =  mat.length;
        int col = mat[0].length;
        boolean a[] = new boolean [row];
        boolean b[] = new boolean[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==1)
                {
                    a[i] = true;
                    b[j] = true;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i]||b[j])
                {
                    mat[i][j] = 1;
                }
            }
        }
        
    }
}