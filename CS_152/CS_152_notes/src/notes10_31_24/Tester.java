package notes10_31_24;

public class Tester {
	public static void main(String[] args) {
		
		
		Node LL = new Node(200); // the values were added to the (  )
		//LL.data = 200;
		
		LL.next = new Node(300);
		//LL.next.data = 300;
		
		LL.next.next = new Node(150);
		//LL.next.next.data = 150;
		
		System.out.print(LL.getData() + "->"); // the .data was changed to get.Data() because we changed the value to a private 
		System.out.print(LL.next.getData() + "->");
		System.out.print(LL.next.next.getData());

		
	}
	
}
