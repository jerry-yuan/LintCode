package lintcode.q550;

import static utils.JSONUtil.print;

public class Q550 {
    public static void main(String[] args) {
        TopK t=new TopK(2);
        t.add("a");
        t.add("b");
        t.add("c");
        t.add("a");
        t.add("c");

        print(t.topk());

    }
}
