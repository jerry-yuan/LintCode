package lintcode.q250;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    /**
     * @param ambigram: A list of paired ambigram letter.
     * @param word: A string need to be judged.
     * @return: If it is special palindrome string, return true.
     */
    public boolean ispalindrome(List<String> ambigram, String word) {
        // write your code here.
        char[] chars=word.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            char chL=chars[i];
            char chR=chars[chars.length-1-i];
            if(chL!=chR) {
                Set<Character> chLSet = new HashSet<>();
                Set<Character> chRSet = new HashSet<>();

                chLSet.add(chL);
                chRSet.add(chR);

                for (String aReplace : ambigram) {
                    char[] replaces = aReplace.toCharArray();
                    if (replaces[0] == chL) {
                        chLSet.add(replaces[1]);
                    }else if(replaces[1] == chL){
                        chLSet.add(replaces[0]);
                    }
                    if (replaces[0] == chR) {
                        chRSet.add(replaces[1]);
                    }else if(replaces[1]==chR){
                        chRSet.add(replaces[0]);
                    }
                }
                if(!hasCommon(chLSet,chRSet)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean hasCommon(Set<Character> a,Set<Character> b){
        for(Character c1:a){
            for(Character c2:b){
                if(c1==c2){
                    return true;
                }
            }
        }
        return false;
    }
}