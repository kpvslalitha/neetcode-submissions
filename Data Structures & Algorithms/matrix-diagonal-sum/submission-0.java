class Solution {
    public int diagonalSum(int[][] mat) {
        int res1=0,res2=0,sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                {
                    res1=res1+mat[i][j];
                }
                else if(i+j==mat.length-1)
                {
                    res2=res2+mat[i][j];
                }
            }
        }
        sum=res1+res2;
        return sum;
    }
}