package didi.q2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases=scanner.nextInt();
        while(cases-->=0){
            doCalc(scanner);
        }
    }

    private static void doCalc(Scanner scanner) {
        int irelandCount=scanner.nextInt();
        int edges=scanner.nextInt();
        int maxExpense=scanner.nextInt();

        int[][] map=new int[irelandCount][irelandCount];

        for (int i = 0; i <edges; i++) {
            int from = scanner.nextInt()-1;
            int to = scanner.nextInt()-1;
            int expense=scanner.nextInt();
            if(expense>maxExpense){
                continue;
            }
            map[from][to]=expense;
            map[to][from]=expense;
        }
        // 开始DP
        int[] visited=new int[irelandCount];
        visit(map,0,visited);
        if(Arrays.stream(visited).sum()<irelandCount){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }

    private static boolean visit(int[][] map, int current, int[] visited){
        // 访问当前节点
        visited[current]=1;
        // 深度优先遍历
        boolean canBuild=false;
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]==0 && map[current][i]>0){
                canBuild|= visit(map,i,visited);
            }
        }

        // 恢复当前节点
        //visited[current]=0;
        return canBuild;
    }
}
