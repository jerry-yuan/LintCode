package lintcode.q114;

public class Solution {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        int[][] sum=new int[m][n];
        for(int i=0;i<n;i++){
            sum[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=0;
                if(j>0){
                    sum[i][j]+=sum[i][j-1];
                }
                sum[i][j]+=sum[i-1][j];
            }
        }
        return sum[m-1][n-1];
    }
}
