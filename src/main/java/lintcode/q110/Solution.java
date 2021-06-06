package lintcode.q110;


public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if (grid.length == 0) {
            return 0;
        }
        int height = grid.length;
        int width = grid[0].length;
        int[][] sum=new int[height][width];
        sum[0][0]=grid[0][0];
        for(int i=1;i<width;i++){
            sum[0][i]=sum[0][i-1]+grid[0][i];
        }
        for(int i=1;i<height;i++){
            for(int j=0;j<width;j++){
                sum[i][j]=Integer.MAX_VALUE;
                if(j>0){
                    sum[i][j] = Math.min(sum[i][j],sum[i][j-1]+grid[i][j]);
                }
                sum[i][j]=Math.min(sum[i][j],sum[i-1][j]+grid[i][j]);
            }
        }
        return sum[height-1][width-1];
    }

    public int minPathSum(int[][] grid, int cX, int cY) {
        if (cX + 1 == grid.length && cY + 1 == grid[cX].length) {
            return grid[cX][cY];
        }
        int value = Integer.MAX_VALUE;
        if (cX + 1 < grid.length) {
            value = Math.min(value, minPathSum(grid, cX + 1, cY));
        }
        if (cY + 1 < grid[cX].length) {
            value = Math.min(value, minPathSum(grid, cX, cY + 1));
        }
        return value + grid[cX][cY];
    }
}
