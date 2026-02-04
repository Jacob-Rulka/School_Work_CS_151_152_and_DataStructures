
import java.util.Scanner;
import java.util.InputMismatchException;


public class notes09_05_24 {
	public static void main(String[] args) {

		
		int x;
		int y;
		// for int use nextInt(), for double use nextDouble(), 
		// for string (one word) use next(), for line use nextLine()
		
		try {
		
		//prompt the user 
			System.out.println("Enter two values:");
			Scanner r = new Scanner( System.in );
		
			x = r.nextInt();
			y = r.nextInt();
		
			int z = x/y;
			
			System.out.println(" The value of x is: "+ x);
			System.out.println(" The value of y is: "+ y);
			System.out.println(" The value of z is: "+ z);
				
		}
		
			// for a vague exception, you can say --- catch(Exception e) { }
		catch(Exception e) {
			System.out.print("Error "+ e.getMessage() ); //e.getMessage will tell you the issue sometime
			}
		/*
		catch(InputMismatchException e) {
			System.out.println("Error in input type!");
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic calculation error!");
		*/
}
}

// input mismatch type, there is a class that catches any 

