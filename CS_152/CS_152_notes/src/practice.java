import java.util.InputMismatchException;
import java.util.Scanner;

public class practice {
	public static void main(String [] args) {
		
		int i,num;
		Scanner kb = new Scanner(System.in);
		num = kb.nextInt();
		switch(num){
		case 1: System.out.println("You have pressed "+1); break;
		case 2: System.out.println("You have pressed "+2); break;
		default: switch(num%3){
		 case 0: System.out.println("Default zero"); break;
		 case 1: System.out.println("Default one"); break;
		 case 2: System.out.println("Default two"); break;
		}
		}
	}
	
	}
