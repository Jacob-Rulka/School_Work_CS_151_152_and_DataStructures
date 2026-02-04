import java.util.Random;
import java.util.Scanner;

public class notes10_08_24 {
	
	static double PI =3.14;
	double radius = 3.2;
	
	static void getArea() {
		
		double r = 3.2; // this radius will be used, variable override 
		
		double area = PI*r*r;
		
		// you can't use an instance variable in a static method ********* 
		// or you can't use a non-static variable in a static method 
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		int watts;
		int Lumens;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter value for watts:");
		watts=kb.nextInt();
		
		switch (watts) {
		case (15):
			Lumens=125;
			System.out.println(Lumens);
			break;
		case (25):
			Lumens=215;
			System.out.println(Lumens);
			break;
		case (40):
			Lumens=500;
			System.out.println(Lumens);
			break;
		case (60):
			Lumens=880;
			System.out.println(Lumens);
			break;
		case (75):
			Lumens=1000;
			System.out.println(Lumens);
			break;
		case (100):
			Lumens=1675; 
			System.out.println(Lumens);
			break;
		default: 
			Lumens = -1;
			System.out.println(Lumens);
		}
		
		
		System.out.println();

		
		
		
		int line1 = 0;
		int line2 = 1;
		for (int i=0; i<7 ; i++) {
			System.out.print(line1 + "   ");
			System.out.println(line2);
			line1 = line1 + 1;
			line2 = line2 * 2;
				
		}
		
		System.out.println();
		
		
		Random generator = new Random();
	 	int Password;
	 	Password = generator.nextInt();
		if (Password <0)
			Password = Password*(-1);
	 	
	 	System.out.println(Password);
		
		
		System.out.println();

		
		int years = 0;
		for (double P = 9870; P<30000; ) {
			P=P*1.10;
			years++;
		}
		System.out.println(years);
		
		System.out.println();
		
		int i=0, x=20;
		while (i<10) {
			if(x==20)
			x+=10;
			else
			x+=30;
			i++;
			}
			System.out.println("x= "+x+" i= "+i);

		
	}
}
