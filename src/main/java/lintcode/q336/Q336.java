package lintcode.q336;

import static utils.JSONUtil.print;
import static utils.JSONUtil.stringArray;

public class Q336 {
    public static void main(String[] args) {
        print(new Solution().textCompression(stringArray("[\"A big black bear sat on a big black bug.\",\"A big black bug bit a big black bear and made the big black bear bleed blood.\",\"A big black bug bit a big black dog on his big black nose!\"]")));
    }
}
