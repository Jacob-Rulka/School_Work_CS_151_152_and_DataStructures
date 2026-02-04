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

			int count =0;  // count and all its uses are new, just testing 
			
			while(kb.hasNextLine() ){ 			//While the scanner has more to read
				String line = kb.nextLine(); 				//Save each line as a string
				String[] split = line.split("\\s+"); 				//Split line by spaces\
				
				sum0 += Double.valueOf(split[0]);
				sum1 += Double.valueOf(split[1]);
				sum2 += Double.valueOf(split[2]);
				sum3 += Double.valueOf(split[3]);
				sum4 += Double.valueOf(split[4]);
				
				count++;
			}
			
			System.out.println("The mean score of each question is as follows..");
			System.out.println("Q01   " + "Q02    "+ "Q03   " + "Q04   "+ "Q05");
			
			
			DecimalFormat fmt1 = new DecimalFormat("0.##");

			double score0 = sum0/count;
			System.out.print(fmt1.format(score0) + "  ");
			
			double score1 = sum1/24;
			System.out.print(fmt1.format(score1) + "  ");

			double score2 = sum2/24;
			System.out.print(fmt1.format(score2) + "  ");
			
			double score3 = sum3/24;
			System.out.print(fmt1.format(score3) + "  ");
	
			double score4 = sum4/24;
			System.out.print(fmt1.format(score4) + "  ");
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
}