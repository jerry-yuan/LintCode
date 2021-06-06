package lintcode.q193;

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        // write your code here
        char[] strChars=s.toCharArray();
        Stack<Character> characterStack=new Stack<>();
        int maxLength=0;
        int matched=0;
        for (int i = 0; i < strChars.length; i++) {
            if(strChars[i]=='('){
                characterStack.push('(');
            }else if(strChars[i]==')'){
                if(characterStack.isEmpty() || characterStack.peek()!='('){
                    // 匹配失败
                    characterStack.clear();
                    maxLength = Math.max(maxLength,matched*2);
                    matched=0;
                }else{
                    // 匹配成功
                    characterStack.pop();
                    matched++;
                }
            }
        }
        maxLength = Math.max(maxLength,matched*2);
        return maxLength;
    }
}
