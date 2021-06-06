package meituan.pretest2020Front.q4;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static final int DIRECTIONS[][] = {
            {-1, 0, 0},  // cX-
            {1, 0, 0},  // cX+
            {0, -1, 0},  // cY-
            {0, 1, 0},  // cY+
            {0, 0, -1},  // cZ-
            {0, 0, 1},  // cZ+
    };

    public static int maxEnergy(int[][][] grid, int[][][] visited, int cX, int cY, int cZ) {
        int maxValue = grid[cX][cY][cZ];
        int N = grid.length;
        // visit当前位置
        visited[cX][cY][cZ] = 1;
        for (int[] direction : DIRECTIONS) {
            // go Directions
            int nextX = cX + direction[0];
            int nextY = cY + direction[1];
            int nextZ = cZ + direction[2];
            if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= N || nextZ < 0 || nextZ >= N) {
                continue;
            }
            if (visited[nextX][nextY][nextZ] == 1) {
                continue;
            }
            if (grid[nextX][nextY][nextZ] > grid[cX][cY][cZ]) {
                continue;
            }
            maxValue = Math.max(maxValue, grid[cX][cY][cZ]+maxEnergy(grid, visited, nextX , nextY, nextZ));
        }
        // 还原当前位置
        visited[cX][cY][cZ] = 0;
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input
        int N = scanner.nextInt();
        int[][][] grid = new int[N][N][N];
        int maxX = -1, maxY = -1, maxZ = -1, maxEnergy = Integer.MIN_VALUE;
        for (int i = 0; i < N * N * N; i++) {
            int tX = scanner.nextInt();
            int tY = scanner.nextInt();
            int tZ = scanner.nextInt();
            int tValue = scanner.nextInt();
            grid[tX][tY][tZ] = tValue;
            if (tValue > maxEnergy) {
                maxX = tX;
                maxY = tY;
                maxZ = tZ;
                maxEnergy = tValue;
            }
        }
        int[][][] visited=new int[N][N][N];
        for(int x=0;x<N;x++){
            for(int y=0;y<N;y++){
                for(int z=0;z<N;z++){
                    visited[x][y][z]=0;
                }
            }
        }
        System.out.println(maxEnergy(grid, new int[N][N][N], maxX, maxY, maxZ));
    }
}
