package lintcode.q156;

import java.util.Arrays;

import static utils.JSONUtil.print;

public class Q156 {
    public static void main(String[] args) {
        print(new Solution().merge(Arrays.asList(
                new Interval(2,3),
                new Interval(2,2),
                new Interval(3,3),
                new Interval(1,3),
                new Interval(5,7),
                new Interval(2,2),
                new Interval(4,6)
        )));
    }
}
