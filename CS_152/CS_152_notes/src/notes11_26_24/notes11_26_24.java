package notes11_26_24;

public class notes11_26_24 {

	
	public static void doSomething(int n){
	      if (n > 0){
	            doSomething(n - 1);
	             System.out.print(n);
	             doSomething(n - 1);
	  }
	}

	public static void main(String[] args) {
		
	doSomething(3);
		
		
		
		
	}
}
