package lintcode.q347;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param matrix: a matrix of m x n elements
     * @return: an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        // write your code here
        List<Integer> result=new LinkedList<>();
        if(matrix.length<1){
            return result;
        }

        int[][] direction=new int[][]{
            {1,0},{0,1},{-1,0},{0,-1}
        };

        int height = matrix.length;
        int width  = matrix[0].length;

        int[][] visited=new int[height][width];
        for(int i=0;i<height;i++){
            for (int j = 0; j < width; j++) {
                visited[i][j]=0;
            }
        }

        int cX=0;
        int cY=0;

        int dIndex=0;

        while(true){
            if(cY<0|| cY>=height||cX<0||cX>=width||visited[cY][cX]==1){
                break;
            }
            while(cX>=0 && cY>=0 && cX<width && cY<height && visited[cY][cX]==0){
                // visit
                result.add(matrix[cY][cX]);
                visited[cY][cX]=1;
                cX += direction[dIndex][0];
                cY += direction[dIndex][1];
            }

            cX -= direction[dIndex][0];
            cY -= direction[dIndex][1];

            cX = Math.max(0,cX);
            cX = Math.min(cX,width-1);

            cY = Math.max(0,cY);
            cY = Math.min(cY,height-1);

            dIndex = (dIndex+1)%direction.length;

            cX += direction[dIndex][0];
            cY += direction[dIndex][1];
        }

        return result;
    }
}