/* Problem Statement - Given a string containing only ()[]{}, determine if the string is valid (every open bracket has a matching closing bracket in correct order). */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("Problem = Valid Parentheses");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the String which contains (),{},[]: ");
        String str=sc.nextLine();
        boolean result = solution(str);
        System.out.println("Is it valid: "+result);
        sc.close();
    }
    public static boolean solution(String str){
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
