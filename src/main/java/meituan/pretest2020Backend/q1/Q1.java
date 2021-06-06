package meituan.pretest2020Backend.q1;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String firstInteger=scanner.nextLine();
        String secondInteger=scanner.nextLine();

        BigInteger integerA=new BigInteger(firstInteger.substring(1,firstInteger.length()-1));
        BigInteger integerB=new BigInteger(secondInteger.substring(1,secondInteger.length()-1));
        System.out.println("\""+integerA.add(integerB).toString()+"\"");
    }
}
