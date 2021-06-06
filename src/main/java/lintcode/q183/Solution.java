package lintcode.q183;

public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        int left=1;
        int right=Integer.MAX_VALUE;
        int mid=0;
        int total;
        while(left<right){

            mid=left+(right-left)/2;
            total=sum(L,mid);
            if(total<k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return sum(L,left)>=k?left:left-1;
    }
    public int sum(int[] L,int len){
        int sum=0;
        for(int i=0;i<L.length;i++){
            sum += L[i]/len;
        }
        return sum;
    }
}