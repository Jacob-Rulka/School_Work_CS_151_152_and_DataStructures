import java.util.Scanner;

public class MyExceptionHandler {
	public static void main(String[] args) {
		
		boolean flag = true;  // the code will run until "you will get support" is printed and a correct age is entered
	
	
		int age;
		
		Scanner kb = new Scanner(System.in);
		
		
		while(flag==true) {
			try {
				System.out.println("Enter your age: ");
				age = kb.nextInt();
				
				if (age >18 && age <= 65) {
					throw new IllegalArgumentException("No support");  		// will throw the exception if you get "no support", try, catch will not give a red error message
				} 
				System.out.println("You will get supoprt");
				flag = false; 		// the code will run until "you will get support" is printed and a correct age is entered (without exception code
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
	
			}
		}
	}
}

