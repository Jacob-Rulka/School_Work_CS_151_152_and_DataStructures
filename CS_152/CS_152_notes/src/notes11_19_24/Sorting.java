package notes11_19_24;

public class Sorting { // try making this in a recursive method

		public void selection(int[] list) {
			
			int minIndex;
			
			for(int i=0; i<list.length; i++) {
				minIndex = findMinIndex(list,i); 

				
				// swap the values 
				int temp = list[i]; 
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}			
			
			
		}
		
		public int findMinIndex(int[] list, int start) { // passing by reference - happens with arrays and objects - the values of changes are saved 
			int minIndex = -1;
			if(list.length>start) {
				minIndex = start;
				for(int i = start+1 ; i<list.length ; i++) {
					if (list[minIndex]>list[i]) {
						minIndex = i;
					}
				}
			}
			return minIndex;
		}
		
		public void selectionOneMethod(int[] list) {
			
			 for(int i=0; i<list.length; i++) {
				 int minIndex = i; 
				 for(int j=i+1; j<list.length; j++) {
					 if(list[minIndex] > list[j])
						 minIndex = j;
				 }
					 
				 int temp = list[i]; 
					list[i] = list[minIndex];
					list[minIndex] = temp;
				 
				 
			 }
			
		}
		
		
}
