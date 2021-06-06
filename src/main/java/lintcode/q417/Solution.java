package lintcode.q417;

import java.util.regex.Pattern;

public class Solution {
    /**
     * @param s: the string that represents a number
     * @return: whether the string is a valid number
     */
    public boolean isNumber(String s) {
        // write your code here
        return s.trim().matches("^((\\d+(\\.\\d+)?)|(\\d+\\.)|(\\.\\d+))(e\\d+)?$");

    }
}
