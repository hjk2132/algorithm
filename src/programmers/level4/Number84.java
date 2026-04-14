package programmers.level4;

import java.util.Stack;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/76502
public class Number84 {
    public int solution(String s) {
        int count = 0;
        String input = s;

        for (int i = 0; i < s.length(); ++i) {
            if (check(input)) {
                count = count + 1;
            }

            input = getNew(input);
        }

        return count;
    }

    public String getNew(String s) {
        String str1 = s.substring(0,1);
        String str2 = s.substring(1);
        String newStr = str2 + str1;

        return newStr;
    }

    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            }

            if (s.charAt(i) == '{') {
                stack.push('{');
            }

            if (s.charAt(i) == '[') {
                stack.push('[');
            }

            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (top == '{' || top == '[') return false;
                }
            }

            if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (top == '(' || top == '[') return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (top == '(' || top == '{') return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
