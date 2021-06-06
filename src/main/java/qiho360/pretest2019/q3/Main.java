package qiho360.pretest2019.q3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int flowerObserved = scanner.nextInt();
        int flowerCount = scanner.nextInt();

        int[][] flowers=new int[flowerObserved+1][flowerCount];
        int[] flowerObserveSum = new int[flowerCount];
        Arrays.fill(flowerObserveSum,0);
        for (int i = 0; i < flowerObserved; i++) {
            flowerObserveSum[scanner.nextInt()]++;
            System.arraycopy(flowerObserveSum,0,flowers[i],0,flowerCount);
        }

        int questionCount=scanner.nextInt();
        for (int i = 0; i < questionCount; i++) {
            int from=scanner.nextInt()-1;
            int to=scanner.nextInt();
            int types=0;
            for (int j = 0; j < flowerCount; j++) {
                if(flowers[to][j]!=0 && flowers[from][j]!=flowers[to][j]){
                    types++;
                }
            }
            System.out.println(types);
        }


    }
}
