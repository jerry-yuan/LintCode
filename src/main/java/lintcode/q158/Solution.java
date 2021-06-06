package lintcode.q158;

public class Solution {
    public boolean anagram(String s, String t) {
        // write your code here
        char[] s1Chars=s.toCharArray();
        char[] s2Chars=t.toCharArray();

        int[] dict=new int[256];
        for (int i = 0; i < 256; i++) {
            dict[i]=0;
        }
        for(char a:s1Chars){
            dict[a]++;
        }
        for(char a:s2Chars){
            dict[a]--;
        }
        for(int i:dict){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
