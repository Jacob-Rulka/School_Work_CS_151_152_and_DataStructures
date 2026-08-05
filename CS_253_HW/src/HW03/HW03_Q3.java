package HW03;

import java.util.Arrays;
import java.util.Scanner;

public class HW03_Q3 {
	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 	
        System.out.print("Enter the number of test cases / sequences: ");
        int testCase = kb.nextInt();  

        for (int test = 0; test < testCase; test++) {
            System.out.print("Enter the length of the sequence: ");
            int length = kb.nextInt();
            
            System.out.println("Enter sequence of numbers, be sure to include a space between each number (X X X):");
            int[] numbers = new int[length];
            for (int i = 0; i < length; i++) {
                numbers[i] = kb.nextInt();
            }

            int pivot = -1;
            for (int i = length - 1; 0 < i; i--) {
                if (numbers[i] > numbers[i - 1]) {
                    pivot = i - 1;
                    break;
                }
            }

            if (pivot == -1) {
                System.out.println("No greater number can be formed.");
                break;
            } else {
                int nextGreaterIndex = -1;
                for (int i = length - 1; pivot < i; i--) {
                    if (numbers[i] > numbers[pivot]) {
                        nextGreaterIndex = i;
                        break;
                    }
                }

                int temp = numbers[pivot];
                numbers[pivot] = numbers[nextGreaterIndex];
                numbers[nextGreaterIndex] = temp;
                
                Arrays.sort(numbers, pivot + 1, length);
                System.out.println("");
                System.out.println("Next greater number: ");
                for (int i = 0; i < length; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        kb.close(); 
    }
}