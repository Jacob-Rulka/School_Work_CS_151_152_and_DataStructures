package notes11_19_24;

public class notes11_19_24 {
	public static void main(String [] args) {
		
		int[] list = {5, 9, -1, -2, 30, 60, 2};
		
		Sorting mysort = new Sorting();
		
		mysort.selection(list);
		
		for (int i=0; i<list.length; i++)
			System.out.print(list[i] + ", ");

		System.out.println();
		
		
		mysort.selectionOneMethod(list);
		
		for (int i=0; i<list.length; i++)
			System.out.print(list[i] + ", ");


		
	}

}
