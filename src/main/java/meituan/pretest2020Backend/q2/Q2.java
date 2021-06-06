package meituan.pretest2020Backend.q2;

import java.util.Scanner;

public class Q2 {
    public static boolean isReverse(String str,int left,int right){
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String toCheck=scanner.nextLine();
        int count=0;
        for (int i=0;i<toCheck.length();i++){
            for(int j=i;j<toCheck.length();j++){
                count+=isReverse(toCheck,i,j)?1:0;
            }
        }
        System.out.println(count);
    }
}
