
public class BuggyCodeChallenge {
	    public static void main(String[] args) {
	        BuggyCodeChallenge challenge = new BuggyCodeChallenge();
	        System.out.println(challenge.calculateSum(5));
	        System.out.println(challenge.reverseString("Hello"));
	        int[] numbers = { 1, 2, 3, 4, 5 };
	        challenge.printNumbers(numbers);
	    }

	    public int calculateSum(int n) {
	        int sum = 0;     							// sum doesn't have a initial value
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;								// "
	    }

	    public String reverseString(String str) {
	        String reversed = null;									// string doesn't have a input
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i); 
	        }
	        return reversed;									// "
	    }

	    public void printNumbers(int[] numbers) {
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
