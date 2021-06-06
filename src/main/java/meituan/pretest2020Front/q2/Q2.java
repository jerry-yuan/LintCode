package meituan.pretest2020Front.q2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q2 {
    public static int calc(int[] aTickets,int nextValue) throws Exception {
        int totalSum=0;
        Integer[] tickets=Arrays.stream(aTickets).boxed().toArray(Integer[]::new);
        Arrays.sort(tickets, Comparator.reverseOrder());
        for(int i=0;i<tickets.length;i++){
            if(nextValue>tickets[i]){
                totalSum += nextValue/tickets[i];
                nextValue%=tickets[i];
            }
        }
        if(nextValue!=0){
            throw new Exception();
        }
        return totalSum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            int nextValue=scanner.nextInt();
            if(nextValue==0){
                break;
            }
            int ticketCount=scanner.nextInt();
            int[] tickets=new int[ticketCount];
            for(int i=0;i<ticketCount;i++){
                tickets[i]=scanner.nextInt();
            }
            try {
                System.out.println(calc(tickets, nextValue));
            }catch (Exception exception){
                System.out.println("Impossible");
            }
        }
    }
}
