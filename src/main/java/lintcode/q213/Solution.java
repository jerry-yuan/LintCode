package lintcode.q213;

public class Solution {
    /**
     * @param originalString: a string
     * @return: a compressed string
     */
    public String compress(String originalString) {
        // write your code here
        char[] chars=originalString.toCharArray();
        char prevCh=0;
        int count=0;
        String result="";
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=prevCh){
                if(prevCh!=0){
                    result+=""+prevCh+count;
                }
                prevCh=chars[i];
                count=1;
            }else{
                count++;
            }
        }
        if(prevCh!=0){
            result+=""+prevCh+count;
        }
        return originalString.length()<result.length()?originalString:result;
    }
}