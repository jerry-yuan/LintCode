package lintcode.q945;

public class Q945 {
    public static void main(String[] args) {
        // 98
        System.out.println(new Solution().leastInterval("AAABBBCCCDDDEE".toCharArray(), 2));
        System.out.println(new Solution().leastInterval("AAABBB".toCharArray(), 2));
        System.out.println(new Solution().leastInterval("BFJJCHICEGCEJFGJBIBBCBGAJHCGDEHEHAHIAJCGBGHGH".toCharArray(), 15));
    }
}
