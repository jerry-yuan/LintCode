package lintcode.q1421;

import java.util.Arrays;

public class Solution {
    /**
     * @param grids: a integer matrix
     * @return: return the difference between two people at last.
     */
    public int MatrixGame(int[][] grids) {
        // write your code here
        int height=grids.length;
        int width=grids[0].length;
        for(int i=0;i<width;i++){
            for(int j=1;j<height;j++){
                if(grids[j][i]>grids[0][i]){
                    grids[j][i]=grids[0][i]^grids[j][i];
                    grids[0][i]=grids[0][i]^grids[j][i];
                    grids[j][i]=grids[0][i]^grids[j][i];
                }
            }
        }
        Arrays.sort(grids[0]);
        int a=0;
        int b=0;
        for(int i=width-1;i>=0;i--){
            if((width-i)%2!=0){
                a+=grids[0][i];
            }else{
                b+=grids[0][i];
            }
        }
        return a-b;
    }
}