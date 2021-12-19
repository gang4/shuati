package com.shuati;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); 
        if (s.isEmpty() || s.length() < 2) {
            return false;
        } 
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i ++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;    
            }
            char c = stack.peek();
            if (isPaired(c, s.charAt(i))) {
                stack.pop();
                continue;
            }
            else {
                stack.push(s.charAt(i));
            }
        }  
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isPaired(char i, char j) {
        if (i == '(' && j == ')') {
            return true;
        }
        if (i == '[' && j == ']') {
            return true;
        }
        if (i == '{' && j == '}') {
            return true;
        }
        return false;
    }
}
