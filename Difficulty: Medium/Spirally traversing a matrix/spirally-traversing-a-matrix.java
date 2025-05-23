class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = mat.length-1;
        int colEnd = mat[0].length-1;
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
        for(int i=colStart;i<=colEnd;i++)
        {
            list.add(mat[rowStart][i]);
        }
        rowStart++;
        for(int i=rowStart;i<=rowEnd;i++)
        {
            list.add(mat[i][colEnd]);
        }
        colEnd--;
        if(rowStart<=rowEnd)
        {
            for(int i=colEnd;i>=colStart;i--)
            {
                list.add(mat[rowEnd][i]);
            }
            rowEnd--;
        }
        if(colStart<=colEnd)
        {
            for(int i=rowEnd;i>=rowStart;i--)
            {
                list.add(mat[i][colStart]);
            }
            colStart++;
        }
        }
        return list;
    }
}
