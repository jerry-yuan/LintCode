package lintcode.q188;

public class Solution {
    public int InsertFive(int a) {
        // write your code here
        int newInteger=0;
        boolean isNegative = a<0;
        a=Math.abs(a);
        int e10= (int) Math.log10(Math.max(1,a));
        int rate = (int) Math.pow(10,e10);
        boolean inserted=false;
        while(e10-->=0){
            int nextInt=a/rate;
            if((isNegative?(nextInt>=5):(nextInt<=5)) && !inserted){
                newInteger=newInteger*10+5;
                inserted=true;
            }
            newInteger=newInteger*10+nextInt;
            a=a%rate;
            rate/=10;
        }
        return newInteger*(isNegative?-1:1);
    }
}
