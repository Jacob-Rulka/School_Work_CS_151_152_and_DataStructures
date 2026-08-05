package HW03;

import java.util.Stack;

public class HW03_Q2 {
	public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
		String sequence = "JAV#A#L#A#C#K#";
        String poppedChars = "";
        
        for (int i = 0; i < sequence.length(); i++) {
            char currentChar = sequence.charAt(i);
            
            if (currentChar != '#') {
                stack.push(currentChar);
                System.out.println("Pushed Character: " + currentChar);
            } else {
                if (!stack.isEmpty()) {
                    char poppedChar = stack.pop();
                    poppedChars += poppedChar; 
                    System.out.println("Popped Character: " + poppedChar);
                } else {
                    System.out.println("Stack is empty! Nothing can be popped.");
                }
            }   
            System.out.println("Current stack: " + stack);
        }        
        System.out.println("Characters popped from the stack: " + poppedChars);
    }
}