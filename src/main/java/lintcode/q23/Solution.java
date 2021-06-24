package lintcode.q23;

public class Solution {
    /**
     * @param c: A character.
     * @return: The character is alphanumeric or not.
     */
    public boolean isAlphanumeric(char c) {
        // write your code here
        if(c>='0'&&c<='9'){
            return true;
        }else if(c>='a'&&c<='z'){
            return true;
        }else if(c>='A'&&c<='Z'){
            return true;
        }else{
            return false;
        }
    }
}