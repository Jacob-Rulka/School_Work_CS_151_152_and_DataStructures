package HW01;

import java.util.Scanner;

public class HW01_Q3 {
	
	public static void findPairsBruteForce(int[] input, int target) {
		boolean noSolution = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    System.out.println(input[i] + " " + input[j]);
                    noSolution = false;
                }
            }
        }
        if (noSolution) {
            System.out.println("Not possible.");
        }
    }
		
	
	public static void mergeSort(int[] input) {
        if (input.length < 2) {
            return;
        }

        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[input.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = input[i]; 
        }
        for (int i = mid; i < input.length; i++) {
            right[i - mid] = input[i]; 
        }

        mergeSort(left);
        mergeSort(right);
        merge(input, left, right);
    }

	
	public static void merge(int[] input, int[] leftHalf, int[] rightHalf) {
		int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
            	input[k++] = leftHalf[i++]; 
            } else {
            	input[k++] = rightHalf[j++];
            }
        }
        
        while (i < leftHalf.length) {
        	input[k++] = leftHalf[i++];
        }
        
        while (j < rightHalf.length) {
        	input[k++] = rightHalf[j++];
        }
    }
	
	
	public static void findPairsImproved(int[] input, int target) {
		mergeSort(input);
		
		int left = 0;              
		int right = input.length - 1;
		boolean noSolution = true;

		while (left < right) {
			int sum = input[left] + input[right];  
			if (sum == target) {
				System.out.println(input[left] + " " + input[right]);
				noSolution = false;
				left++;   
				right--;  
			} else if (sum < target) {
				left++;   
				} else {
					right--;
				}
		}
	        if (noSolution) {
	            System.out.println("Not possible.");
	        }
	}	
	
	public static void main(String[] args) {
		int size;
		int target;		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		size = kb.nextInt();
		
		int[] input = new int[size];
		System.out.print("Enter the elements: ");
		for(int i = 0; i<size; i++) 
			input[i] = kb.nextInt();
		
		System.out.print("Enter the value of k: ");
		target = kb.nextInt();
		
		System.out.println("\n" + "BruteForce solution");
		findPairsBruteForce(input, target);
		
		System.out.println("\n" + "Improved solution");
		findPairsImproved(input, target);
		
		kb.close();
	}

}

	
/*  Sample Run 1
 *  Enter size of array: 10
	Enter the elements: 2 5 6 11 -1 0 25 -3 1 8 
	Enter the value of k: 22
	-3 25
	Sample Run 2
	Enter size of array: 10
	Enter the elements: 2 5 6 11 -1 0 25 -3 1 8 
	Enter the value of k: 50
	Not possible.
 */
	
