package HW02;

import java.util.Arrays;
import java.util.Random;

public class Hw02 {

    public static int ArrayLengthGenerate() {
        Random generator = new Random();
        int arrLength;
        arrLength = generator.nextInt(4951) + 50;
        System.out.println("Array Length: " + arrLength);
        System.out.println();
        return arrLength;
    }

    public static int[] ArrayGenerate(int arrayLength) {
        int[] data = new int[arrayLength];
        Random generator = new Random();
        for (int i = 0; i < arrayLength; i++) {
            int randNum = generator.nextInt(10000);
            data[i] = randNum;
        }
        return data;
    }

    public static int recursiveBubbleSort(int[] data, int n) {
        if (n == 1) 
        	return 0;

        boolean swapped = false;
        int swaps = 0;
        for (int i = 0; i < n - 1; i++) {
            if (data[i] > data[i + 1]) {
                int temp = data[i];
                data[i] = data[i + 1];
                data[i + 1] = temp;
                swapped = true;
                swaps++;
            }
        }

        if (swapped) {
            swaps += recursiveBubbleSort(data, n - 1);
        }

        return swaps;
    }

    public static int recursiveInsertionSort(int[] data, int n, int swaps) {
    	 if (n <= 1) 
    		 return 0;

    	 swaps = recursiveInsertionSort(data, n - 1, swaps);
    	 int key = data[n - 1]; 
    	 int j = n - 2;

    	 while (j >= 0 && data[j] > key) {
    		 data[j + 1] = data[j]; 
    		 j--;
    	     swaps++;
    	 }
    	 data[j + 1] = key;

    	 return swaps;
    	}
    
    public static int recursiveSelectionSort(int[] data, int start) {
        if (start >= data.length - 1) 
        	return 0;

        int minIndex = start;
        for (int i = start + 1; i < data.length; i++) {
            if (data[i] < data[minIndex]) 
                minIndex = i;
        }

        int swaps = 0;
        if (minIndex != start) {
            int temp = data[start];
            data[start] = data[minIndex];
            data[minIndex] = temp;
            swaps++;
        }

        swaps += recursiveSelectionSort(data, start + 1);
        return swaps;
    }

    public static int recursiveShellSort(int[] data, int gap) {
        if (gap == 0) 
        	return 0;

        int swaps = 0;
        for (int i = gap; i < data.length; i++) {
            int temp = data[i];
            int j = i;
            while (j >= gap && data[j - gap] > temp) {
                data[j] = data[j - gap];
                j -= gap;
                swaps++;
            }
            data[j] = temp;
        }

        swaps += recursiveShellSort(data, gap / 2);
        return swaps;
    }

    public static int recursiveMergeSort(int[] data, int[] temp, int left, int right) {
        if (left >= right) 
        	return 0;

        int mid = (left + right) / 2;
        int swaps = 0;

        swaps += recursiveMergeSort(data, temp, left, mid);
        swaps += recursiveMergeSort(data, temp, mid + 1, right);

        swaps += merge(data, temp, left, mid, right);
        return swaps;
    }

    public static int merge(int[] data, int[] temp, int left, int mid, int right) {
        System.arraycopy(data, left, temp, left, right - left + 1);

        int i = left;
        int j = mid + 1;
        int k = left;
        int swaps = 0;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                data[k] = temp[i];
                i++;
            } else {
                data[k] = temp[j];
                j++;
                swaps++;
            }
            k++;
        }

        while (i <= mid) {
            data[k] = temp[i];
            i++;
            k++;
        }

        while (j <= right) {
            data[k] = temp[j];
            j++;
            k++;
        }

        return swaps;
    }

    public static void main(String[] args) {
    	int arrLength = ArrayLengthGenerate();
        // int arrLength = 5000;
        int[] data = ArrayGenerate(arrLength);
        int[] arr1 = data.clone();
        int[] arr2 = data.clone();
        int[] arr3 = data.clone();
        int[] arr4 = data.clone();
        int[] arr5 = data.clone();

        long startTime, endTime;
        
        System.out.println("The unsorted data set (array):");        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");        

        startTime = System.nanoTime();
        int bubbleSwaps = recursiveBubbleSort(arr1, arr1.length);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ns");
        System.out.println("Bubble Sort Swaps: " + bubbleSwaps);
        System.out.println();
        
        startTime = System.nanoTime();
        int swaps = 0;
        int insertionSwaps = recursiveInsertionSort(arr2, arr2.length, swaps);
        endTime = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (endTime - startTime) + " ns");
        System.out.println("Insertion Sort Swaps: " + insertionSwaps);
        System.out.println();

        startTime = System.nanoTime();
        int selectionSwaps = recursiveSelectionSort(arr3, 0);
        endTime = System.nanoTime();
        System.out.println("Selection Sort Time: " + (endTime - startTime) + " ns");
        System.out.println("Selection Sort Swaps: " + selectionSwaps);
        System.out.println();

        startTime = System.nanoTime();
        int shellSwaps = recursiveShellSort(arr4, arr4.length / 2);
        endTime = System.nanoTime();
        System.out.println("Shell Sort Time: " + (endTime - startTime) + " ns");
        System.out.println("Shell Sort Swaps: " + shellSwaps);
        System.out.println();

        startTime = System.nanoTime();
        int[] temp = new int[arr5.length];
        int mergeSwaps = recursiveMergeSort(arr5, temp, 0, arr5.length - 1);
        endTime = System.nanoTime();
        System.out.println("Merge Sort Time: " + (endTime - startTime) + " ns");
        System.out.println("Merge Sort Swaps: " + mergeSwaps);
        System.out.println();
        
        
        if (Arrays.equals(arr1,arr2) && Arrays.equals(arr2,arr3) && Arrays.equals(arr3,arr4) && Arrays.equals(arr4,arr5)) {
        	System.out.println("The sorted data set (array):");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }
    }
}

