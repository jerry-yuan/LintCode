package meituan.test2020.q1;

import java.util.Scanner;

public class Main {
    private static boolean canFold(int[][] grid, int height, int width) {
        if (height % 2 == 1) {
            return false;
        }
        int top = 0;
        int bottom = height - 1;
        while (top < bottom) {
            for (int i = 0; i < width; i++) {
                if (grid[top][i] != grid[bottom][i]) {
                    return false;
                }
            }
            top++;
            bottom--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] grid = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int originHeight = height;

        while (canFold(grid, originHeight, width)) {
            originHeight /= 2;
        }
        for (int i = 0; i < originHeight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j]);
                System.out.print(j + 1 == width ? "\n" : " ");
            }
        }
    }
}
