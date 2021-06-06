package qiho360.pretest2019.q1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        long minX=Long.MAX_VALUE;
        long minY=Long.MAX_VALUE;
        long maxX=Long.MIN_VALUE;
        long maxY=Long.MIN_VALUE;
        int peopleNum = scanner.nextInt();
        for(int i=0;i<peopleNum;i++){
            int cX=scanner.nextInt();
            int cY=scanner.nextInt();
            minX = Math.min(minX,cX);
            minY = Math.min(minY,cY);
            maxX = Math.max(maxX,cX);
            maxY = Math.max(maxY,cY);
        }
        long width = Math.max(maxX-minX,maxY-minY);
        System.out.println(width*width);
    }

}
