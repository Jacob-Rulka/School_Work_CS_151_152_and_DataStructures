package defaultpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;


public class HW01aa {
	
	public static void main(String[] args) {

		FileInputStream fis;
		try {
			//Open file
			fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/defaultpackage/Hw1aFile.txt");

			
		    //Create Scanner
		    Scanner kb = new Scanner(fis);
			kb.nextLine(); 			//Skip first line
			
			//Variables for averages
			double sum0 = 0;
			double sum1 = 0;
			double sum2 = 0;
			double sum3 = 0;
			double sum4 = 0;

			while(kb.hasNextLine() ){ 			//While the scanner has more to read
				String line = kb.nextLine(); 				//Save each line as a string
				String[] split = line.split("\\s+"); 				//Split line by spaces\
				
//				for(String x: split) {
//					System.out.print(x);
//					System.out.print("  ");
//				}
//					
				sum0 += Double.valueOf(split[0]);
				sum1 += Double.valueOf(split[1]);
				sum2 += Double.valueOf(split[2]);
				sum3 += Double.valueOf(split[3]);
				sum4 += Double.valueOf(split[4]);				
			}
			
			System.out.println("The mean score of each question is as follows..");
			System.out.println("Q01  " + "Q02  "+ "Q03  " + "Q04  "+ "Q05");
			
			double score0 = sum0/24;
			DecimalFormat fmt1 = new DecimalFormat("0.##");
			System.out.print(fmt1.format(score0) + " ");
			
			double score1 = sum1/24;
			System.out.print(fmt1.format(score1) + " ");

			double score2 = sum2/24;
			System.out.print(fmt1.format(score2) + " ");
			
			double score3 = sum3/24;
			System.out.print(fmt1.format(score3) + " ");
	
			double score4 = sum4/24;
			System.out.print(fmt1.format(score4) + " ");
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
}
		
		
			
			
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
