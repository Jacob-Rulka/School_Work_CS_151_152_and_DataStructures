package notes10_24_24;

public class notes10_24_24 {
	
	int n=0;
	int m=0;
	
	int sub(int n) {
		if (n==1)
			return 1;
		else
			return n*sub(n-1);	
	}
	
	int mult(int n, int m) {
		if (n==1)
			return m;
		else 
			return m + mult(m,n-1);
		
		//mult(for(int i = 0; i<=m ; i++) 
		//	return n+n;);
		
	}

	
	
	public static void main(String[] args) {

		
	}
}
