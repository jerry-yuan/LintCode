package lintcode.q420;

public class Solution {
    /**
     * @param n: the nth
     * @return: the nth sequence
     */
    public String countAndSay(int n) {
        // write your code here
        String t="1";
        while(--n>0){
            t=countLikeSB(t);
        }
        return t;
    }
    public String countLikeSB(String toCount){
        StringBuilder buffer=new StringBuilder();
        int count=0;
        char current=toCount.charAt(0);
        int index=0;
        //while((*dst++)=(*src++))!=0);
        while(index<toCount.length()){
            if(toCount.charAt(index)==current){
                count++;
                index++;
            }else{
                buffer.append(count);
                buffer.append(current);
                count=0;
                current=toCount.charAt(index);
            }
        }
        if(count>0){
            buffer.append(count);
            buffer.append(current);
        }

        return buffer.toString();
    }
}