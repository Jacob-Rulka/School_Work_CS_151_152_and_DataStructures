package notes10_31_24;

public class Node {
	private int data;
	Node next = null;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
	public int getData() {
		return this.data;
	}
	
}
