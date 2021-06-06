package lintcode.q264;

public class Solution {
    /**
     * @param array: An given array.
     * @return: Return the number of "universal" subarrays.
     */
    public int subarrays(int[] array) {
        if (array.length<2){
            return 0;
        }
        // write your code here.
        int[] sum=new int[array.length];
        int current=array[0];
        int count=1;
        int sumIndex=0;
        for (int i = 1; i < array.length; i++) {
            if(current!=array[i]){
                sum[sumIndex++]=count;
                count=1;
                current=array[i];
            }else{
                count++;
            }
        }
        sum[sumIndex++]=count;
        int subs=0;
        for (int i = 0; i < sumIndex-1; i++) {
            subs+=Math.min(sum[i],sum[i+1]);
        }
        return subs;
    }
}
