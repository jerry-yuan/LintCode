package lintcode.q158;

import static utils.JSONUtil.print;

public class Q158 {
    public static void main(String[] args) {
        print(new Solution().anagram("ab","ab"));
        print(new Solution().anagram("abcd","dcba"));
        print(new Solution().anagram("ac","ab"));
    }
}
