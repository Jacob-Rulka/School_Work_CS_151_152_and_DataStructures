package HW01;

/*
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HW01_Q1 {
	
	private static int[][] readMatrix(int rows, int columns, BufferedReader reader) throws IOException {
	    int[][] matrix = new int[rows][columns];
	    // Logic to read the matrix row by row
	    
	    // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Read a line of input and split it by spaces
            String[] rowValues = reader.readLine().split(" ");
            
            // Loop through each column in the current row and parse the values into integers
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(rowValues[j]);  // Store the value in the matrix
            }
        }
	   
	    // Your code should go here
	    return matrix;
	}


	public static void main(String[] args) throws IOException {
		
		int rows;
		int columns;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many rows?");
		rows = kb.nextInt();
		System.out.println("How many columns?");
		columns = kb.nextInt();
		
		kb.nextLine();
		
		System.out.println("Enter the values in a formated 2D array based on your input for rows and columns");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrix = readMatrix(rows, columns, reader );
		
		System.out.println("The matix:");
		for (int i = 0; i<rows; i++) {
		    for (int j = 0; j<columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		    System.out.println();
		}
	}
}

*/


/*
 * 
 * EX: 
 * Rows: 3 
 * Columns: 3
 * Input: 
 * 1 2 3 
 * 4 5 6
 * 7 8 9
 * 
 */



import java.util.Scanner;

public class HW01_Q1 {
	
	private static int[][] readMatrix(int rows, int columns, Scanner kb) {
	    int[][] matrix = new int[rows][columns];
	    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = kb.nextInt();  
            }
        }
	   
	    return matrix;
	}

	public static void main(String[] args) {
		
		int rows;
		int columns;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many rows?");
		rows = kb.nextInt();
		System.out.println("How many columns?");
		columns = kb.nextInt();
		
		System.out.println("Enter the values for the matrix:");

		int[][] matrix = readMatrix(rows, columns, kb );
		
		System.out.println("The matrix:");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		    System.out.println();
		}
		kb.close();
	}
}




// Task 1 ^^^^^^
// Task 2 vvvvvv

//import java.io.*;
//import java.util.Scanner;
//
//public class HW01_Q1 {
//
//    private static int[][] readMatrix(int rows, int columns, BufferedReader reader) throws IOException {
//    	 int[][] matrix = new int[rows][columns]; 	    
//         for (int i = 0; i < rows; i++) {
//             String[] rowValues = reader.readLine().split(" ");
//             for (int j = 0; j < columns; j++) {
//                 matrix[i][j] = Integer.parseInt(rowValues[j]); 
//             }
//         }
//  	    return matrix;
// 	}
//
//    public static void main(String[] args) throws IOException {
//
//        int rows;
//        int columns;
//        Scanner kb = new Scanner(System.in);
//
//        System.out.println("How many rows?");
//        rows = kb.nextInt();
//        System.out.println("How many columns?");
//        columns = kb.nextInt();
//
//        kb.nextLine();
//
//        System.out.println("Enter the values in a formatted 2D array based on your input for rows and columns");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[][] matrix = readMatrix(rows, columns, reader);
//
//        System.out.println("The matrix:");
//        int index = 0;
//        while (index < rows * columns) {
//            System.out.print(matrix[index / columns][index % columns] + " ");
//            if ((index + 1) % columns == 0) {
//                System.out.println();
//            }
//        }
//    }
//}   
// 
//    
    
    
    