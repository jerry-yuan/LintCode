package meituan.pretest2020Front.q3;

import java.util.Scanner;

public class Q3 {
    public static int minValue(int[][] grid){
        if(grid.length==0){
            return 0;
        }
        int height= grid.length;
        int width=grid.length;

        int[][] distance=new int[height][width];
        distance[0][0]=grid[0][0];
        for(int i=1;i<width;i++){
            distance[0][i]=distance[0][i-1]+grid[0][i];
        }

        for(int j=1;j<height;j++){
            for(int i=0;i<width;i++){
                distance[j][i] = distance[j-1][i]+grid[j][i];
                if(i>0){
                    distance[j][i]=Math.min(distance[j][i],distance[j][i-1]+grid[j][i]);
                }
            }
        }
        return distance[height-1][width-1];

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int[][] grid=new int[height][width];
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                grid[i][j]=scanner.nextInt();
            }
        }
        System.out.println(minValue(grid));

    }
}
