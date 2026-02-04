package defaultpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;


public class HW01a {
	public static void main(String[] args) {

		FileInputStream fis;
		try {
			fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/defaultpackage/Hw1aFile.txt");

		    double[][] QuestionScore = new double[25][4];

		    System.out.print("Hello");
			try (Scanner kb = new Scanner(fis)) {
				kb.nextLine(); 			//Skip first line
				int row = 0,col = 0; 			//Initialize row and col variable

				System.out.print("Hello");
				while(kb.hasNextLine() ){ 			//While the scanner has more to read
					String line = kb.nextLine(); 				//Save each line as a string
					String[] split = line.split(" "); 				//Split line by spaces\
					
					for(int i = 0; i<5; i++) { 				//For each index in split array
						double x = Double.valueOf(split[0]); 			//save double from split array
						QuestionScore[row][col] = x; 				//insert double into 2-d array
						col++; 			//increment col
					}
					row++;					//increment row
					col = 0;	//reset col

					
					System.out.print("Hello");
					
				for(int rows = 0; rows<24; rows++) {
					for(int cols=0; cols<5; cols++) {
						
						//Save variable
						double score = QuestionScore[rows][cols];
						
						//Print formatted decimal
						DecimalFormat fmt1 = new DecimalFormat("0.##");
						System.out.print(fmt1.format(score) + " "); // use old code to format 0.##
					}
					
					//Print a new line
					System.out.println();
					
				}
				double A1 = 0;
				
				for(int i = 0; i<25; i++) {
					
					
					A1 = A1 + QuestionScore[row][col];
					row++;
				}
				A1= A1/row;	
				
				double A2 = 0;
				for(int i = 0; i<25; i++) {
					row = 0;
					col = 1;
					A2 = A2 + QuestionScore[row][col];
					row++;
				}
				A2= A2/row;	
				
				double A3 = 0;
				for(int i = 0; i<25; i++) {
					row = 0;
					col = 2;
					A3 = A3 + QuestionScore[row][col];
					row++;
				}
				A3= A3/row;	
					
				double A4 = 0;
				for(int i = 0; i<25; i++) {
					row = 0;
					col = 3;
					A4 = A4 + QuestionScore[row][col];
					row++;
				}
				A4= A4/row;	
					
				double A5 = 0;
				row = 0;
				for(int i = 0; i<25; i++) {
					A5 = A5 + QuestionScore[row][4];
					row++;
				}
				A5= A5/row;	
				
				DecimalFormat fmt = new DecimalFormat("0.##");
				
				System.out.println("The mean score of each question is as follows..");
				System.out.println("Q01  " + "Q02  "+ "Q03  " + "Q04  "+ "Q05");
				System.out.print(fmt.format(A1) + " "); // use old code to format 0.##
				System.out.print(fmt.format(A2) + " ");
				System.out.print(fmt.format(A3) + " ");
				System.out.print(fmt.format(A4) + " ");
				System.out.print(fmt.format(A5) + " ");
				}
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}}
		
		
			
			
//			for(QuestionScore[0][row]))	
//			
//				
//				
//			for(int i = 0; i < row; i++){    
//				double sumRow = 0;    
//				for(int j = 0; j < col; j++){    
//					sumRow = sumRow + QuestionScore[i][j];     
//				
//				}}
//			
//					
					
					
//				while(kb.hasNextLine() ){
//					
//					//Save each line as a string
//					String line = kb.nextLine();
//					//Split line by spaces
//					String[] split = line.split(" ");
//					
//					//For each index in split array
//					for(int i = 0; i<5; i++) {
//						
//						//save double from split array
//						double x = Double.valueOf(split[0]);
//						
//						//insert double into 2-d array
//						QuestionScore[row][col] = x;
						
				
				
			
			
			
			
			
//			while ( kb.hasNextDouble() );
//			{
//				int length = QuestionScore.length;
//				 
//			}
//			
//			
//			System.out.println();
//			System.out.println(QuestionScore[23][2]);//		int numRows = kb.nextInt();
//    	
//		int numCol = kb.nextInt();
//    	kb.nextLine();
//    	int[][] scores = new int[numRows][numCol];
//
//    	for(int i=0; i<numRows;i++) {
//      	for(int j=0;j<numCol;j++) {
//            	scores[i][j]= i+j;
//        }
//      System.out.println(scores[i])
