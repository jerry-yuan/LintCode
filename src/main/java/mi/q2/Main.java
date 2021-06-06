package mi.q2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Set<Character> existedChars=new HashSet<>();

        String toProcess=scanner.nextLine();
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < toProcess.length(); i++) {
            char ch=toProcess.charAt(i);
            if (!existedChars.contains(ch)) {
                // 没有字符添加并入库
                builder.append(ch);
                existedChars.add(ch);
            }
        }
        System.out.println(builder.toString());
    }
}
