import java.util.Scanner;

public class notes09_12_24 {
	
//	static double overloading(double a, double b) {
//		double M; 
//		M = a * b;
//		
//		return M;
//	}
//	
//	static double overloading(double x, double y, double z) {
//		double M;
//		M = x * y * z;
//		return M;
//	}
//	
//	static double overloading(double l, double m, double n, double o) {
//		double M;
//		M = l * m * n * o;
//		return M;
//	}
//	
//	
	
		public static double Mult(double a, double b) {
		
		double product = a*b;
		return product;
	}
		
		public double Mult(double a, double b, double c) {
			double product = a*b*c;
			return product;
		}
	
		public double Mult(double a, double b, double c, double d) {
			double product = a*b*c*d;
			return product;
		}
	
	
		public static void main(String[] args) {
		
		notes09_12_24 overload = new notes09_12_24();
		
				
		System.out.println(overload.Mult(2,3));
		System.out.println(overload.Mult(2,3,4));
		System.out.println(overload.Mult(2,3,4,5));
		
		System.out.println();
		System.out.println(Mult(2,3));
		
		
		System.out.println();

	

	
	
		char l;
		
		System.out.println("Type a letter");
		Scanner kb = new Scanner( System.in );
		l = kb.next().charAt(0); 
		
		if (l == 'a' || l == 'A') {
			System.out.println("Apple");
		}
		else if (l == 'b' || l == 'B') {
			System.out.println("Ball");
		}
		else if (l == 'c' || l == 'C') {
			System.out.println("Cat");
		}
		else {
			System.out.println("Other");
		}
		kb.close();
		
		
		
	}
}





