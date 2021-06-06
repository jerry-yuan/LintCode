package lintcode.q3;

public class Solution {
    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int sum=0;
        for(int i=0;i<=n;i++){
            String strInt=""+i;
            for(int j=0;j<strInt.length();j++){
                sum+=(strInt.charAt(j)=='0'+k)?1:0;
            }
        }
        return sum;
    }
}
