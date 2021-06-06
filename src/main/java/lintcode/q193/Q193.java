package lintcode.q193;

import static utils.JSONUtil.print;

public class Q193 {
    public static void main(String[] args) {
        //print(new Solution().longestValidParentheses(")()())"));
        //print(new Solution().longestValidParentheses("(()"));
        print(new Solution().longestValidParentheses(")(()(()(((())(((((()()))((((()()(()()())())())()))()()()())(())()()(((()))))()((()))(((())()((()()())((())))(())))())((()())()()((()((())))))((()(((((()((()))(()()(())))((()))()))())"));
    }
}
