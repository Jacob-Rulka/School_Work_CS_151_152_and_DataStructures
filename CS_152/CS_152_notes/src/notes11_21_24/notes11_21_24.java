package notes11_21_24;

import java.util.Arrays;

public class notes11_21_24 {

	public static void main(String[] args) {

	        int[] array = {4, 10, 20, 3, 7};
	        int n = array.length;

	        int key;
	        int j;

	        // Insertion Sort algorithm
	        for (int i = 1; i < n; i++) { // Loop starts at 1, not n-1
	            key = array[i];
	            j = i - 1;

	            while (j >= 0 && array[j] > key) {
	                array[j + 1] = array[j];
	                j = j - 1;
	            }

	            array[j + 1] = key;
	        }

	        // Print the sorted array using Arrays.toString
	        System.out.println(Arrays.toString(array));
	    }
		
		
		//		
//		
//		int[] array = {4,10,20,3,7};
//		int n = array.length;
//		
//		int key;
//		int j;
//		
//		for(int i = 1; i < n-1; i++) {
//			key = array[i];
//			j = i-1;
//			
//			while( j >= 0 && array[j] > key ) {
//				array[j+1] = array[j];
//				j= j-1;	
//			}
//			
//			array[j+1] = key;	
//		}
//		
//		System.out.println(array);
//		
//		
//	}
	
}
