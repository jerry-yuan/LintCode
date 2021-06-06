package meituan.test2020.q3;

import java.util.Scanner;

public class Main {
    public static long getTypes(int blanks, int total, int maxInteger, int prevMax, int minMaximium) {
        if (blanks == 1) {
            prevMax = Math.max(prevMax, total);
            if (total > 0 && total <= maxInteger && prevMax >= minMaximium) {
                return 1L;
            } else {
                return 0L;
            }
        }
        long types = 0;
        // 尝试当前位
        for (int i = 1; i <= Math.min(maxInteger, total); i++) {
            types = (types + getTypes(blanks - 1, total - i, maxInteger, Math.max(prevMax, i), minMaximium)) % 998244353;
        }
        return types;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int maxInteger = scanner.nextInt();
        int minMaxium = scanner.nextInt();
        long types = 0L;
        for (int blank = 2; blank <= total - minMaxium + 1; blank++) {
            long aTypes = getTypes(blank, total, maxInteger, Integer.MIN_VALUE, minMaxium);
            types = (types + aTypes) % 998244353;
        }
        System.out.println(types % 998244353);
    }
}
