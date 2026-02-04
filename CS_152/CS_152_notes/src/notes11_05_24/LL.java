package notes11_05_24;


public class LL {

	Node head;
	
	public LL() {
		this.head = null;
	}
	
	public void addToLast(int data) {
		if (this.head == null)
			this.head = new Node(data);	
		else if (this.head.next == null)
			this.head.next = new Node(data);
		else {
			Node tail = this.head;
			while(tail.next!= null)
				tail = tail.next;	
			tail.next = new Node(data);
			
		}
	}
	
	public void print() {
		if(this.head==null)
			System.out.println("The liist is empty!");
		
		else {
			Node tail = this.head;
			
			while(tail!= null) {
				System.out.println(tail.getData() + ",");
				tail=tail.next;
			}
				
				
		}
	}
	
	public void delete (int target) {
		
		if (this.head == null)
			System.out.println("The target is not available");
		else {
			Node tail = this.head;
			Node prev=null;
			
			while(tail!=null && tail.getData() != target) {
				prev = tail;
				tail = tail.next;
			}
		prev.next = tail.next;
		}
		
	}
	
	
}
		
//		
//		System.out.println(head);
//		while (head != null)
//			System.out.println(head.next);
//			head = head.next;
	

//	public getData() {
//
//		return null;
//	}
//	
//	


