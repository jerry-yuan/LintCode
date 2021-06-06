package lintcode.q936;


public class Solution {
    /**
     * @param s: a string
     * @return: a string after capitalizes the first letter
     */
    public String capitalizesFirst(String s) {
        // Write your code here
        StringBuilder builder = new StringBuilder();
        boolean requiredCapitalize = true;
        for (int i = 0; i < s.length(); i++) {
            if (requiredCapitalize && s.charAt(i) != ' ') {
                builder.append(Character.toUpperCase(s.charAt(i)));
                requiredCapitalize=false;
            }else if(s.charAt(i) == ' '){
                requiredCapitalize=true;
                builder.append(" ");
            }else{
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}