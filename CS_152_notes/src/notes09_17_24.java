import java.util.Scanner;

public class notes09_17_24 {
	public static void main(String[] args) {
//		char ch;
//		System.out.println(" Tyoe a letter");
//		Scanner kb = new Scanner(System.in);
//		ch = kb.next().charAt(0);
//		
//		if (ch == 'a' || ch == 'A')
//			System.out.println("Apple");
//		else if (ch == 'b' || ch == 'B')
//			System.out.println("Ball");
//		else 
//			System.out.println("Other");
		
//	int num = 1;
//	for (int i = 5; i<6 && i>0; i--) {
//		num = num * i;
//	}
//	System.out.println(num);
	
	int power = 100;
	int Total_loops = 20;
	double top=0, bottom=0, answer;
	
	answer = 1+power;
	
	for (int i=2; i <= Total_loops; i++) {
		top = Math.pow(power, i);
		bottom = i;
		
		for (double j=(bottom-1); j>0; j--) {
			
			
		}
		
		answer = answer + (top/bottom);
		
	}
		
	System.out.println(answer);	
	
		
	double math, x;
	System.out.println("type a number");
	Scanner kb = new Scanner(System.in);
	x = kb.nextDouble();
	
	//math = 1 + x + ( (x*x)/(2*1) ) + ( (x*x*x)/(3*2*1) ) + ( (x*x*x*x) / (4*3*2*1)) + ( (x*x*x*x*x)/(5*4*3*2*1) );

	int TWO = 1;
	for (int i = 2; i<3 && i>0; i--) {
		TWO = TWO * i;
	}
	int THREE = 1;
	for (int i = 3; i<4 && i>0; i--) {
		THREE = THREE * i;
	}
	int FOUR = 1;
	for (int i = 4; i<5 && i>0; i--) {
		FOUR = FOUR * i;
	}
	int FIVE = 1;
	for (int i = 5; i<6 && i>0; i--) {
		FIVE = FIVE * i;
	}
	
	math = 1 + x + ( (x*x)/(TWO) ) + ( (x*x*x)/(THREE))  + ( (x*x*x*x) / (FOUR)) + ( (x*x*x*x*x)/(FIVE) );

	System.out.println(math);
	
	
	double Ftwo;
	double Fthree;
	double Ffour;
	double Ffive;
	double num=1;
	for (int i = 1; i>0; i++) {
		for (int j =1; i>0; j++) {
			
			
		}
		Ftwo = num;
		
	}
	
	
	
	
	
	
	
	
	
	}	
}
