package lintcode.q280;

import static utils.JSONUtil.*;

public class Q280 {
    public static void main(String[] args) {
        print(new Solution().NearestNeighbor(
                intArray("[3, 2, 1]"),
                intArray("[3, 2, 3]"),
                stringArray("[\"c1\", \"c2\", \"c3\"]"),
                stringArray("[\"c1\", \"c2\", \"c3\"]")
        ));
        print(new Solution().NearestNeighbor(
                intArray("[23, 23, 23]"),
                intArray("[1, 10, 20]"),
                stringArray("[\"fastcity\", \"bigbanana\", \"xyz\"]"),
                stringArray("[\"fastcity\", \"bigbanana\", \"xyz\"]")
        ));
    }
}
