package org.example.neetcode.stack;

import java.util.*;

public class ValidParentheses {

    public static boolean example(String s) {
        Deque<Character> stack =  new ArrayDeque<>();

        Map<Character, Character> closedOpen = new HashMap<>();
        closedOpen.put(')', '(');
        closedOpen.put(']', '[');
        closedOpen.put('}', '{');

        for(char c: s.toCharArray()) {
            if (closedOpen.containsKey(c)) {
                if (!stack.isEmpty() && Objects.equals(stack.peek(), closedOpen.get(c))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

}