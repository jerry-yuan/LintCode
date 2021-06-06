package didi.q1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner=new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String strToReverse=scanner.nextLine();

        // process
        Stack<Character> charStack=new Stack<Character>();
        StringBuilder builder=new StringBuilder();
        int chIndex=0;
        while(chIndex<strToReverse.length()){
            charStack.push(strToReverse.charAt(chIndex));
            if(charStack.size()>=N){
                while(!charStack.isEmpty()){
                    builder.append(charStack.pop());
                }
            }
            chIndex++;
        }
        while(!charStack.isEmpty()){
            builder.append(charStack.pop());
        }


        System.out.println(builder.toString());


    }
}
