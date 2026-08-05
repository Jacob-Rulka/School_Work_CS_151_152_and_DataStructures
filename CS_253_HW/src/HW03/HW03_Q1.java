package HW03;

import java.util.Scanner;
import java.util.Stack;

public class HW03_Q1 {
	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
        	char ch = input.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
            	stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
            	if (stack.isEmpty()) {
                	return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a sequence of characters: ");
        String sequence = kb.nextLine();
        
        if (isBalanced(sequence)) {
            System.out.println("The sequence of delimiters is balanced.");
        } else {
            System.out.println("The sequence of delimiters is NOT balanced.");
        }
        kb.close();
    }
}

