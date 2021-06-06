package lintcode.q115;

public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid.length==0){
            return 0;
        }
        int height=obstacleGrid.length;
        int width=obstacleGrid[0].length;

        int[][] sum=new int[height][width];
        sum[0][0]=1;
        for(int i=1;i<width;i++){
            sum[0][i]=obstacleGrid[0][i]==0?sum[0][i-1]:0;
        }
        for(int i=1;i<height;i++){
            for(int j=0;j<width;j++){
                sum[i][j]=0;
                if(obstacleGrid[i][j]==1){
                    continue;
                }
                if(j>0){
                    sum[i][j]+=sum[i][j-1];
                }
                sum[i][j]+=sum[i-1][j];
            }
        }

        return sum[height-1][width-1];
    }
}
