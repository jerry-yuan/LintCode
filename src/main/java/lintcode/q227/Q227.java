package lintcode.q227;


import static utils.JSONUtil.print;

public class Q227 {
    public static void main(String[] args) {
        Tower[] towers = new Tower[3];
        for (int i = 0; i < 3; i++)
            towers[i] = new Tower(i);
        for (int i = 2; i >= 0; i--)
            towers[0].add(i);
        towers[0].moveDisks(3, towers[2], towers[1]);
        print(towers);
    }
}
