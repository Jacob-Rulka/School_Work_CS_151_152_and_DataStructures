package notes11_05_24;


import java.util.Random;


public class notes11_05_24 {

	

	
	    
	    public static String generatePassword() {
	        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	        String digits = "0123456789";
	        String specialChars = "!@#$%^&*()";
	        
	        String allCharacters = upperCase + lowerCase + digits + specialChars;
	        
	        Random random = new Random();
	        
	        StringBuilder password = new StringBuilder();
	        
	        int length = 8;
	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(allCharacters.length());
	            password.append(allCharacters.charAt(randomIndex));
	        }
	        
	        return password.toString();
	    }

	    public static void main(String[] args) {
	        String password = generatePassword();
	        
	        System.out.println("Generated Password: " + password);
	    
	}
	
}
