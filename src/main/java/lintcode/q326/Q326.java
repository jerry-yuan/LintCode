package lintcode.q326;

import java.awt.print.Printable;

import static utils.JSONUtil.intMatrix;
import static utils.JSONUtil.print;

public class Q326 {
    public static void main(String[] args) {
        print(new Solution().SlidingWindows(intMatrix("[[1,2,3,2,5,7],[4,5,6,1,7,6],[7,8,9,4,8,3]]")));
    }
}
