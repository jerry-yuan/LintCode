package lintcode.q277;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution {
    /**
     * @param words: the words given.
     * @param wordA: the first word you need to find.
     * @param wordB: the second word you need to find.
     * @return: return the spacing of the closest wordA and wordB.
     */
    public int wordSpacing(List<String> words, String wordA, String wordB) {
        // write your code here.
        List<Integer> indexA = new LinkedList<>();
        List<Integer> indexB = new LinkedList<>();
        int iWord = 0;
        // 找WordA
        for (String word : words) {
            if (wordA.equals(word)) {
                indexA.add(iWord);
            }
            if (wordB.equals(word)) {
                indexB.add(iWord);
            }
            iWord++;
        }
        if(indexA.isEmpty()||indexB.isEmpty()){
            return -1;
        }
        int minDistance = Integer.MAX_VALUE;
        for (Integer iWordA : indexA) {
            for (Integer iWordB : indexB) {
                minDistance=min(minDistance,max(iWordA,iWordB)-min(iWordA,iWordB));
            }
        }
        return minDistance;
    }
}