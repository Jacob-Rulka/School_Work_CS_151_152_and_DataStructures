
import java.util.Scanner;


public class notes09_03_24 {
	public static void main(String[] args) {
		
		// create a object
		//Scanner.r; 						// r is a reference 
		//r = new Scanner( ); 				//r becomes a object 
		
		String x,y;
		
		//prompt the user 
		System.out.println("Enter two values:");
		
		Scanner r = new Scanner( System.in );
		
		x = r.next();
		// for int use nextInt(), for double use nextDouble(), 
		// for string (one word) use next(), for line use nextLine()
		y = r.next();
		
		
		System.out.println(" The value of x is: "+ x);
		System.out.println(" The value of y is: "+ y);

	}
}
 