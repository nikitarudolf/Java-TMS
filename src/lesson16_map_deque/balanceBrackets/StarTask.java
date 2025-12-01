package lesson16_map_deque.balanceBrackets;

import java.util.ArrayDeque;

public class StarTask {
    public static void main(String[] args) {
        System.out.println(isBalanced("[(5x-1)*(11-2x)={x+8}]"));


    }

    public static boolean isBalanced(String input) {
        ArrayDeque<Character> bracketsStack = new ArrayDeque<>();

        for(char c : input.toCharArray()) {
            if(isClosingBracket(c)) {
                if(bracketsStack.isEmpty()) return false;
                if(isPair(bracketsStack.peek(), c)) {
                    bracketsStack.pop();
                    continue;
                } else return false;
            }
            if(isOpeningBracket(c)) bracketsStack.push(c);
        }
        return bracketsStack.isEmpty();
    }

    public static boolean isPair(char openBracket, char closeBracket) {
        return openBracket == '(' && closeBracket == ')' || openBracket == '{' && closeBracket == '}' || openBracket == '[' && closeBracket == ']';
    }

    public static boolean isClosingBracket(char bracket) {
        return (bracket == ')' || bracket == '}' || bracket == ']');
    }
    public static boolean isOpeningBracket(char bracket) {
        return (bracket == '(' || bracket == '{' || bracket == '[');
    }
}
