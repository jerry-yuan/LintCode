package lintcode.q141;

public class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        long left=1;
        long right=x;
        long mid,pow;
        while(left<right-1){
            mid=(left+right)/2;
            pow=mid*mid;
            if(pow<x){
                left=mid;
            }else if(pow>x){
                right=mid;
            }else{
                return (int) mid;
            }
        }
        if(right*right==x){
            return (int) right;
        }else {
            return (int) left;
        }
    }
}
