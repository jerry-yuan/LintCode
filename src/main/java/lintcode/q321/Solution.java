package lintcode.q321;

public class Solution {
    /**
     * @param s: string need to be transformed
     * @param k: minimum char can be transformed in one operation
     * @return: minimum times to transform all char into '1'
     */
    public int perfectString(String s, int k) {
        // Write your code here
        int zeroCount=0;
        boolean inZeros=false;
        int flipCount = 0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='0'){
                if(inZeros){
                    flipCount += (zeroCount+1)/k;
                    zeroCount = (zeroCount+1)%k;
                }else{
                    zeroCount = 1;
                    inZeros = true;
                }
            }else{
                if(inZeros){
                    inZeros=false;
                    flipCount+=zeroCount>0?1:0;
                }
            }
        }
        if(zeroCount>0 && inZeros){
            flipCount++;
        }
        return flipCount;

    }
}
