package mi.q1;

import java.util.*;

public class Main {
    public static final Map<Character, Character> BRACKETS;

    static {
        BRACKETS = new Hashtable<>(3);
        BRACKETS.put('{', '}');
        BRACKETS.put('(', ')');
        BRACKETS.put('[', ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            System.out.println(isValid(scanner.nextLine()) ? "true" : "false");
        }

    }

    public static boolean isValid(String toCheck) {
        Stack<Character> bracketStack = new Stack<Character>();
        for (int i = 0; i < toCheck.length(); i++) {
            char ch = toCheck.charAt(i);
            if (BRACKETS.containsKey(ch)) {
                // 左括号 入栈
                bracketStack.push(ch);
            } else {
                // 右括号 出栈
                if (bracketStack.isEmpty() || !BRACKETS.get(bracketStack.pop()).equals(ch)) {
                    return false;
                }
            }
        }
        return true;
    }
}
