package lintcode.q326;

import java.util.Arrays;

public class Solution {
    /**
     * @param number: an only contains from 1 to 9 array
     * @return: return  whether or not each sliding window position contains all the numbers for 1 to 9
     */
    public boolean[] SlidingWindows(int[][] number) {
        // write your code here
        int[] digitCount=new int[9];
        int windowX=1;
        int windowCount=number[0].length-2;
        boolean[] result=new boolean[windowCount];
        // 第一个窗口
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                digitCount[number[j][i]-1]++;
            }
        }
        result[0]=Arrays.stream(digitCount).allMatch(i->i==1);
        while (windowX<windowCount){
            for (int i = 0; i < 3; i++) {
                digitCount[number[i][windowX-1]-1]--;
                digitCount[number[i][windowX+2]-1]++;
            }
            result[windowX]=Arrays.stream(digitCount).allMatch(i->i==1);
            windowX++;
        }
        return result;
    }
}