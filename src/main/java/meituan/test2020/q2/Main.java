package meituan.test2020.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        int typesSelling = scanner.nextInt();
        int typesNeedBuy = scanner.nextInt();
        int minBeauty = scanner.nextInt();
        if (typesSelling < 1 || typesNeedBuy < 1) {
            System.out.println(0);
            return;
        }
        int[] beauty = new int[typesSelling];
        for (int i = 0; i < typesSelling; i++) {
            beauty[i] = scanner.nextInt();
        }
        // 找到第一个合适的选择
        int front = 0;
        int end = 0;
        int currentBeauty = beauty[0];
        while (end - front + 1 < typesNeedBuy && end < typesSelling) {
            if (beauty[end] == currentBeauty && beauty[end] >= minBeauty) {
                // 仍然满足
                end++;
            } else {
                // 发现end位置不一样了,那么重新初始化front和end
                if (beauty[end] >= minBeauty) {
                    front = end;
                } else {
                    front = end = end + 1;
                }
                currentBeauty = beauty[front];
            }
        }
        if (end - front + 1 < typesNeedBuy) {
            System.out.println("0");
            return;
        }
        // 向后平移
        int sum = 0;
        while (end < typesSelling) {
            if (beauty[end] == currentBeauty && beauty[end] >= minBeauty) {
                // 最新加进来的beauty一致
                sum++;
                front++;
                end++;
            } else {
                // 新进来的beauty不一致=>重新找下一个合适的
                if (beauty[end] >= minBeauty) {
                    front = end;
                } else {
                    front = end = end + 1;
                }
                currentBeauty = beauty[front];
                while (end - front + 1 < typesNeedBuy && end < typesSelling) {
                    if (beauty[end] == currentBeauty && beauty[end] >= minBeauty) {
                        // 仍然一样
                        end++;
                    } else {
                        // 发现end位置不满足了,那么重新初始化front和end
                        if (beauty[end] >= minBeauty) {
                            front = end;
                        } else {
                            front = end = end + 1;
                        }

                        currentBeauty = beauty[front];
                    }
                }
                if (end - front + 1 < typesNeedBuy) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
