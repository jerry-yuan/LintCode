package lintcode.q183;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q183 {
    public static void main(String[] args) {
        print(new Solution().woodCut(intArray("[232,124,456]"),7));
        print(new Solution().woodCut(intArray("[2147483644,2147483645,2147483646,2147483647]"),4));
        print(new Solution().woodCut(intArray("[511,877,644,610,919,5734,148,968,672,637,971,501,305,152,437,446,201,464,312,163,302,2392,7431,876,978,995]"),128));
        print(new Solution().woodCut(intArray("[6,6,5,5,6,5,4,4,5,6,6,6,5,4,5,6,5,6,4,4,4,4,6,4,5,5,4,6,6,6,6,4,6,4,4,5,6,5,5,4,6,4,6,4,4,6,4,5,6,5,6,6,5,4,4,5,6,4,5,5,5,6,6,4,4,5,5,6,5,5,6,4,6,4,5,6,4,4,4,6,4,6,4,5,4,6,5,6,6,5,4,4,6,5,6,5,6,4,4,6,4,6,5,4,4,4,4,6,6,4,6,6,6,5,4,4,6,4,4,4,5,4,6,4,6,6,4,5,6,5,6,5,4,5,5,5,4,6,5,4,5,6,4,4,6,6,5,6,6,4,6,5,6,5,4,6,4,6,4,6,5,6,4,6,6,4,5,4,6,6,5,6,6,5,4,4,4,4,4,5,5,4,6,5,4,6,4,6,5,6,6,5,4,5,6,4,4,6,5,5,6,6,6,4,6,6,5,6,5,4,6,5,4,6,5,6,4,5,4,4,5,4,5,6,6,4,4,4,4,6,6,6,6,6,5,5,4,4,5,5,6,6,5,6,6,6,4,5,5,4,6,4,6,4,4,6,5,6,6,6,5,4,4,4,6,4,6,4,5,6,6,4,5,6,6,6,6,6,4,5,6,4,4,4,4,5,5,5,6,5,5,5,4,4,5,6,6,4,6,6,6,4,5,4,6,5,6,5,5,6,5,4,5,4,6,4,5,5,5,5,5,5,4,5,5,6,4,5,6,5,6,5,6,4,4,5,6,5,6,6,6,5,4,5,4,6,6,6,6,4,5,5,4,5,5,5,4,6,5,5,4,6,5,6,6,6,4,4,4,6,4,6,6,4,5,4,5,6,6,6,5,6,4,6,6,5,6,5,6,4,4,6,4,6,5,6,6,5,4,6,5,6,6,5,6,6,4,6,6,5,6,5,6,4,5,5,5,6,6,4,5,4,4,6,4,6,6,5,6,6,6,5,6,6,4,6,6,5,5,6,5,6,6,6,5,5,6,6,5,4,6,5,6,5,6,5,5,6,5,4,5,6,5,4,6,5,5,4,5,4,5,6,5,6,4,6,5,4,4,4,5,5,4,5,4,6,4,5,5,6,5,6,6,5,4,6,6,5,5,6,5,5,5,5,6,5,5,4,4,6,4,5,4,6,6,5,6,5,6,6,4,5,5,5,5,6,6,4,4,5,6,5,5,6,4,6,6,5,5,6,4,4,4,4,5,4,5,4,5,5,4,5,5,5,4,6,4,4,4,5,4,4,5,4,6,6,5,6,4,4,6,6,4,4,5,6,5,5,4,6,6,4,6,5,4,5,5,6,6,6,4,6,6,5,6,4,5,6,4,6,4,5,5,4,4,6,6,6,4,6,5,5,4,5,5,4,5,6,6,6,4,5,4,5,6,4,6,4,5,4,5,4,6,6,6,5,4,6,4,6,4,5,6,5,6,6,6,5,4,5,6,6,6,6,4,5,6,5,4,4,5,5,4,4,4,5,4,6,6,6,6,4,5,5,4,5,4,5,4,4,6,4,5,5,6,4,6,5,4,6,4,6,5,5,6,5,4,4,5,4,4,5,5,5,5,4,4,5,6,4,4,6,6,5,4,6,5,5,4,4,6,4,6,4,5,6,4,5,4,6,5,4,4,5,6,4,4,5,5,6,6,6,6,6,6,4,6,5,6,6,6,6,4,4,5,6,5,4,5,4,4,5,6,5,5,4,4,4,6,6,6,6,6,4,5,4,4,4,4,5,6,4,4,5,5,6,6,6,6,4,6,6,5,4,6,4,5,4,5,5,4,6,6,4,6,4,5,4,5,5,4,6,5,5,4,4,6,6,5,5,4,6,5,5,6,6,4,6,6,4,6,6,4,5,6,6,5,4,5,4,5,5,5,4,6,5,4,6,5,4,4,5,6,5,5,6,4,4,6,4,4,5,4,5,5,4,5,5,4,4,6,4,5,6,4,4,5,6,6,4,5,4,6,5,5,5,5,6,4,5,6,6,6,4,6,5,4,6,5,4,5,4,5,4,6,4,6,6,4,5,6,4,4,6,5,4,4,5,6,6,4,6,6,4,6,5,6,6,4,4,5,5,6,5,4,4,5,4,5,4,4,6,4,4,4,4,4,4,6,6,6,5,6,5,5,4,5,5,5,5,5,6,5,6,4,6,5,4,5,4,5,4,6,5,5,4,5,6,5,4,5,5,6,4,6,5,6,4,6,6,5,6,4,4,4,5,4,6,4,4,4,5,4,5,4,6,4,4,5,4,5,6,4,6,6,5,4,5,4,5,6,4,5,6,4,5,4,5,5,4,4,5,4,5,6,5,4,5,5,6,4,5,5,4,6,6,6,5,5,5,6,6,4,6,5,4,6,6,6,5,6,6,4,4,5,6,4,4,5,6,5,5,5,6,6,5,4,6,6,5,4,5,6,4,4,6,4,6,4,4,5,4,5,4,5,4,6,4,5,5,6,5,5,4,6,6,4,6,5,5,5,6,5,4,5,6,6,4,6,6,4,5,6,4,6,4,5,4,4,6,5,5,4,6,5,4,6,6,4,4,5,6,4,4,4,4,4,6,6,6,4,5,5,4,4,5,4,4,5,6,5,4,6,6,6,5,6,5,4,5,4,6,6,5,6,5,4,4,5,4,4,4,6,4,5,5,4,4,5,4,5,5,5,5,5,6,4,5,4,4,4,4,4,4,5,4,6,5,5,4,4,5,5,4,4,5,5,6,4,6,4,5,5,6,5,5,6,4,4,5,5,6,5,4,4,4,4,4,6,5,4,5,6,4,4,6,4,4,4,6,4,4,6,5,6,6,6,5,6,5,4,5,4,5,5,6,5,6,4,6,5,6,4,4,6,6,4,4,5,5,5,5,5,4,6,4,5,4,4,4,4,5,6,4,4,5,4,5,5,6,6,5,6,6,5,6,6,5,5,4,5,4,5,5,5,4,4,6,5,4,6,6,6,4,4,6,5,6,5,6,6,4,5,6,6,6,4,4,4,5,4,4,6,5,5,6,4,6,4,6,4,4,4,5,6,6,6,6,5,6,5,5,4,4,6,4,6,4,4,6,6,5,4,4,6,5,4,5,4,4,6,6,6,5,5,5,6,6,6,4,4,6,5,6,4,6,5,6,5,5,5,5,6,5,6,6,4,6,6,6,6,4,5,6,5,6,4,6,6,5,5,4,4,6,4,4,5,4,4,5,6,6,4,4,6,6,6,4,5,4,5,6,6,5,6,4,5,5,5,4,4,4,5,4,5,5,5,5,4,4,5,5,6,4,6,5,5,4,4,6,6,5,6,4,4,6,4,6,4,6,4,4,4,6,5,6,4,6,5,4,4,6,4,6,6,4,5,6,6,4,4,4,4,6,5,4,4,5,5,6,6,5,4,4,4,6,6,5,5,5,6,4,5,4,5,5,4,4,6,5,4,5,4,6,5,6,5,4,4,6,4,5,6,5,4,5,4,5,4,4,5,6,5,6,5,4,5,4,4,5,6,4,6,4,6,4,5,4,4,6,5,5,5,4,5,6,4,5,4,4,6,5,5,6,5,6,6,4,4,6,6,6,6,4,6,4,4,5,4,4,4,6,6,5,4,6,4,6,6,6,5,4,5,6,5,5,5,5,5,4,4,6,4,5,5,5,5,5,5,5,4,6,4,6,6,4,5,4,4,6,5,6,5,4,4,6,5,6,5,6,5,5,6,6,6,5,4,4,4,5,4,6,6,5,5,4,6,5,6,6,5,4,4,5,4,6,5,4,6,6,5,5,5,5,6,6,6,6,6,4,6,6,5,6,6,4,4,4,4,5,4,5,4,4,6,6,6,6,6,6,5,5,5,5,5,5,4,5,4,6,4,4,5,5,5,6,6,5,6,5,4,4,4,6,6,5,6,4,5,5,6,6,4,5,5,4,5,5,4,5,6,5,6,5,6,6,5,5,4,5,4,5,6,5,5,5,4,4,6,5,5,4,4,6,6,6,6,5,6,6,4,5,5,4,5,4,4,4,4,5,6,6,5,4,4,4,5,6,5,5,4,4,6,5,4,6,4,4,4,4,5,6,4,5,5,4,5,4,5,6,5,5,4,5,6,4,5,4,4,4,6,5,4,5,6,4,5,4,4,4,5,5,5,6,6,4,4,6,6,4,4,5,5,6,4,6,6,6,6,4,5,6,4,6,6,6,5,6,5,6,5,5,5,5,5,5,5,4,6,5,4,4,6,6,6,6,6,4,5,4,6,4,5,5,6,6,5,5,6,6,5,6,5,6,4,5,4,5,4,5,6,5,4,5,5,6,4,4,6,6,6,6,5,5,6,4,6,4,6,6,6,6,4,6,5,4,6,4,4,5,6,6,6,6,4,5,6,4,6,4,4,4,6,6,4,5,6,4,6,6,5,6,6,6,5,5,4,4,5,5,5,6,5,6,6,6,6,6,5,5,5,6,4,5,6,5,4,4,5,4,5,5,4,4,6,4,4,6,4,5]"),9000));
    }
}
