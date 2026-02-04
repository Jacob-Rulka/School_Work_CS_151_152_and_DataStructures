package defaultpackage;

import java.util.InputMismatchException;
import java.util.Scanner;


public class HW01c {
	public static void main (String[] main) {
		
		char t,l,m;
		
		
		try {
			System.out.println("Enter bread type white (w or W) or sweet (s or S): ");
			
			Scanner kb = new Scanner( System.in );
			t = kb.next().charAt(0); 
			
			
			
			if (t != 'w' && t != 'W' && t != 's' && t != 'S') {
				System.out.println("Invalid input");
				System.exit(0);
				
			}		
					
				
			
			System.out.println("Is loaf double (y or n)? ");
			l = kb.next().charAt(0);
			
			
			// l = kb.next();
			
			if (l == 'y' || l == 'n') {}
				else {
				System.out.println("Invalid input");
				System.exit(0);
			}
			
			System.out.println("Is baking manual (y or n)? ");
			m = kb.next().charAt(0);
			
			if (m == 'y' || m == 'n') {}
				else {
					System.out.println("Invalid input");
					System.exit(0);
			
				}
			
			
		
			
			
			
		
			
			
			
		System.out.println("Baking process:");
			if (t == 'w' || t == 'W' && l == 'y' && m == 'y') {             // manual bake, l isn't important
				System.out.println("Primary kneading: 15 minutes");
				System.out.println("Primany rising: 60 minutes");
				System.out.println("Secondary kneading: 18 minutes");
				System.out.println("Secondary rising: 20 minutes");
				System.out.println("Loaf shaping: 2 seconds");
				System.out.println("You should remove the dough for manual baking.");
				System.out.println();	
				System.out.println("The total baking time: 113 minutes and 2 seconds.");	
			} else 
				if (t == 'w' || t == 'W' && l == 'y' && m == 'n') {			// machine bake, double loaf 
					System.out.println("Primary kneading: 15 minutes");
					System.out.println("Primany rising: 60 minutes");
					System.out.println("Secondary kneading: 18 minutes");
					System.out.println("Secondary rising: 20 minutes");
					System.out.println("Loaf shaping: 2 seconds");
					System.out.println("Final rising: 75 minutes");
					System.out.println("Baking: 67 minuites and 30 seconds");   //67.5 = 30 seconds
					System.out.println("Cooling: 30 minuites");
					System.out.println();	
					System.out.println("The total baking time: 285 minutes and 32 seconds.");	
				} else 
					if (t == 'w' || t == 'W' && l == 'n' && m == 'y') {             // manual bake, l isn't important
						System.out.println("Primary kneading: 15 minutes");
						System.out.println("Primany rising: 60 minutes");
						System.out.println("Secondary kneading: 18 minutes");
						System.out.println("Secondary rising: 20 minutes");
						System.out.println("Loaf shaping: 2 seconds");
						System.out.println("You should remove the dough for manual baking.");
						System.out.println();	
						System.out.println("The total baking time: 113 minutes and 2 seconds.");	
					} else 
						if (t == 'w' || t == 'W' && l == 'n' && m == 'n') {			// machine bake, no loaf 
							System.out.println("Primary kneading: 15 minutes");
							System.out.println("Primany rising: 60 minutes");
							System.out.println("Secondary kneading: 18 minutes");
							System.out.println("Secondary rising: 20 minutes");
							System.out.println("Loaf shaping: 2 seconds");
							System.out.println("Final rising: 75 minutes");
							System.out.println("Baking: 45 minuees");
							System.out.println("Cooling: 30 minuites");
							System.out.println();	
							System.out.println("The total baking time: 263 minutes and 2 seconds.");
						} else 
							if (t == 's' || t == 'S' && l == 'y' && m == 'y') {       // manual bake, l isn't important
								System.out.println("Primary kneading: 20 minutes");
								System.out.println("Primany rising: 60 minutes");
								System.out.println("Secondary kneading: 33 minutes");
								System.out.println("Secondary rising: 30 minutes");
								System.out.println("Loaf shaping: 2 seconds");
								System.out.println("You should remove the dough for manual baking.");
								System.out.println();	
								System.out.println("The total baking time: 143 minutes and 2 seconds.");
							} else
								if (t == 's' || t == 'S' && l == 'y' && m == 'n') {                //manual bake, double loaf
									System.out.println("Primary kneading: 20 minutes");
									System.out.println("Primany rising: 60 minutes");
									System.out.println("Secondary kneading: 33 minutes");
									System.out.println("Secondary rising: 30 minutes");
									System.out.println("Loaf shaping: 2 seconds");
									System.out.println("Final rising: 75 minutes");
									System.out.println("Baking: 52 minuites and 30 seconds");  
									System.out.println("Cooling: 30 minuites");
									System.out.println();	
									System.out.println("The total baking time: 300 minutes and 32 seconds.");	
								} else
									if (t == 's' || t == 'S' && l == 'n' && m == 'y') {              // manual bake, no 50%
										System.out.println("Primary kneading: 20 minutes");
										System.out.println("Primany rising: 60 minutes");
										System.out.println("Secondary kneading: 33 minutes");
										System.out.println("Secondary rising: 30 minutes");
										System.out.println("Loaf shaping: 2 seconds");
										System.out.println("You should remove the dough for manual baking.");
										System.out.println();	
										System.out.println("The total baking time: 143 minutes and 2 seconds.");
									} else 
										if (t == 's' || t == 'S' && l == 'n' && m == 'n') {			// machine bake, no 50%
											System.out.println("Primary kneading: 20 minutes");
											System.out.println("Primany rising: 60 minutes");
											System.out.println("Secondary kneading: 33 minutes");
											System.out.println("Secondary rising: 30 minutes");
											System.out.println("Loaf shaping: 2 seconds");
											System.out.println("Final rising: 75 minutes");
											System.out.println("Baking: 35 minuees");  
											System.out.println("Cooling: 30 minuites");
											System.out.println();	
											System.out.println("The total baking time: 283 minutes and 2 seconds.");
										}	
			
		}catch(InputMismatchException e) {
				System.out.println("Error in input type!");
				}
			
	}
}