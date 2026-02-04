

import java.io.FileInputStream;
import java.util.*;

public class notes09_05_24pt2 {

	public static void main(String[] args) {
		
		try {
		
			int count = 0;
			
			
			FileInputStream fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_notes/src/file.txt");
			Scanner kb = new Scanner(fis);
			
			
			String x = kb.next();
			
			if(x.equals("A"))			// write A 5x in file.txt on 5, one "A" per line
				count = count+1;
			
			x=kb.next();
			if(x.equals("A"))
				count = count+1;
			
			x=kb.next();
			if(x.equals("A"))
				count = count+1;
			
			x=kb.next();
			if(x.equals("A"))
				count = count+1;
			
			x=kb.next();
			if(x.equals("A"))
				count = count+1;
		
			
			System.out.println("There are total A'S:" + count);
			
			/*
			 * int x = kb.nextInt();
			 
			
			System.out.println("The value read from file is: "+ x);
			
			
			
			x = kb.nextInt();
			
			System.out.println("The balue read from file is: "+ x);
			*/
			
			
			kb.close();
		
		}
		catch(Exception e) {
			System.out.println("Error in opeing file!");
		}
		
		
		
		
		
		
		
	}
}
