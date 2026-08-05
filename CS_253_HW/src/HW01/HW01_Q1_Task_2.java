package HW01;

import java.util.Scanner;

public class HW01_Q1_Task_2 {

	private static int[][] readMatrix(int rows, int columns, Scanner kb) {
	    int[][] matrix = new int[rows][columns];
	    int index = 0;
        for (int i = 0; i < rows * columns; i++) {
            int rowIndex = index / columns; 
            int colIndex = index % columns; 
            matrix[rowIndex][colIndex] = kb.nextInt(); 
            index++; 
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
		for (int i = 0; i < rows * columns; i++) {
			int rowIndex = i / columns; 
			int colIndex = i % columns; 
			System.out.print(matrix[rowIndex][colIndex] + " ");
			if (colIndex == columns - 1) 
				System.out.println();
	        }
		kb.close();
	}
}
