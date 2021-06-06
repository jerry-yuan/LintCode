package lintcode.q185;

public class Solution {
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
        int height=matrix.length;
        int width=matrix[0].length;

        int result[]=new int[height*width];
        int cX=0,cY=0,index=0;
        while(true){
            // visit
            result[index++]=matrix[cY][cX];

            // → OR ↓
            if(cX+1<width){
                cX++;
            }else if(cY+1<height){
                cY++;
            }else{
                break;
            }

            // ↙
            while(cX>0 && cY<height-1){
                result[index++] = matrix[cY][cX];
                cX--;
                cY++;
            }
            // visit
            result[index++]=matrix[cY][cX];
            // ↓ →
            if(cY+1<height){
                cY++;
            }else if(cX+1<width){
                cX++;
            }else{
                break;
            }
            // ↗
            while(cX<width-1 && cY>0){
                result[index++] = matrix[cY][cX];
                cX++;
                cY--;
            }
        }
        return result;
    }
}
