package lintcode.q600;

public class Solution {
    /**
     * @param image: a binary matrix with '0' and '1'
     * @param x: the location of one of the black pixels
     * @param y: the location of one of the black pixels
     * @return: an integer
     */
    public int minArea(char[][] image, int x, int y) {
        // write your code here
        if(image.length == 0){
            return 0;
        }
        int width = image.length;
        int height = image[0].length;

        int left = searchInColumn(image,0,x,false);
        int right = searchInColumn(image,x,width-1,true);
        int top = searchInRow(image,0,y,false);
        int bottom = searchInRow(image,y,height-1,true);

        return (right-left+1)*(top-bottom+1);
    }
    private int searchInColumn(char[][] image,int small,int large,boolean flip){
        int mid;
        while(large - small >2){
            mid=(small+large)/2;
            if(checkColumn(image,mid)^flip){
                small = mid +1;
            }else{
                large = mid -1;
            }
        }
        return large;
    }
    private int searchInRow(char[][] image,int small,int large,boolean flip){
        int mid;
        while(small<large){
            mid=(small+large)/2;
            if(checkRow(image,mid)^flip){
                small = mid+1;
            }else{
                large = mid-1;
            }
        }
        return large;
    }
    private boolean checkColumn(char[][] index,int x){
        if(x<0||x>=index.length){
            return false;
        }
        for(int i=0;i<index[x].length;i++){
            if(index[x][i] != 0){
                return true;
            }
        }
        return false;
    }
    private boolean checkRow(char[][] index,int y){
        if(y<0||y>=index[0].length){
            return false;
        }
        for(int i=0;i<index.length;i++){
            if(index[i][y] != 0){
                return true;
            }
        }
        return false;
    }
}