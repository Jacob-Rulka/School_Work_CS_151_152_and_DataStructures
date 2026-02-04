 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlieWrite {
	public static void main(String[] args) {
									//   ^^^ throws FileNotFoundException {

		try {

			FileInputStream fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_notes/src/file.txt");
			Scanner kb = new Scanner(fis);
			
			
			
			String str;

//			while (kb.hasNextLine()) {  
//				str = kb.nextLine(); 		
//				for (str = 'e') {
//					
	//			}
				str = kb.nextLine();
				System.out.print(str);
				
				FileOutputStream fos = new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_notes/src/output.txt");
				PrintWriter pw = new PrintWriter(fos);
//				
				pw.println(str);

				
				
			//}
			
		
	//		FileOutputStream fos = new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_notes/src/output.txt");
	//		PrintWriter pw = new PrintWriter(fos);
		
			//pw.print(str);
			
	//		pw.print(x);
	//		pw.close();
	//		kb.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error in File I/O operation");
		}

	}

}
