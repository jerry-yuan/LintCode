package lintcode.q182;

public class Solution {
    /**
     * @param A: A positive integer which has N digits, A is a string
     * @param k: Remove k digits
     * @return: A string
     */
    public String DeleteDigits(String A, int k) {
        // write your code here
        char[] chs=A.toCharArray();
        int length=A.length()-k;
        while(k-->0){
            for(int i=findMax(chs);i<length+k-1;i++){
                chs[i]=chs[i+1];
            }
        }
        return new String(chs,0,length);
    }
    public int findMax(char[] a){
        int idx=0;
        char max=a[idx];
        for(int i=1,len=a.length;i<len;i++){
            if(max<a[i]){
                max=a[i];
                idx=i;
            }
        }
        return idx;
    }
}