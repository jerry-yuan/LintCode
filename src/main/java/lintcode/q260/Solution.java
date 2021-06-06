package lintcode.q260;

public class Solution {
    /**
     * @param matrix: a matrix
     * @return: return true if same.
     */
    public boolean judgeSame(int[][] matrix) {
        // write your code here.
        int N = matrix.length;
        for (int i = 1 - N; i < N; i++) {
            int x = Math.max(0, -i);
            int y = x + i;
            int value=matrix[x][y];
            while(x<N && y<N && y>=0){
                System.out.printf("checking (%d,%d) == %d%n",x,y,value);
                if(matrix[x][y]!=value){
                    return false;
                }

                x++;
                y=x+i;
            }

        }
        return true;
    }
}
