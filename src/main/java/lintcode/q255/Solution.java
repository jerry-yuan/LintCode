package lintcode.q255;

public class Solution {
    /**
     * @param sourceString: a string
     * @param targetStrings: a string array
     * @return: Returns a bool array indicating whether each string in targetStrings is a substring of the sourceString
     */
    public boolean[] whetherStringsAreSubstrings(String sourceString, String[] targetStrings) {
        // write your code here
        boolean[] result=new boolean[targetStrings.length];
        for (int i = 0; i < targetStrings.length; i++) {
            result[i]= sourceString.contains(targetStrings[i]);
        }
        return result;
    }
}