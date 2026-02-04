package HW02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NewAccount {

	// Instance fields
	String name;
	String dob;
	double balance;
	int accountNum;

	// Max Account Number
	static int maxAccountNumber = 10000000;

	// Constructors
	public NewAccount(String n, String d, double i) {
		name = n;
		dob = d;
		balance = i;
	}

	public NewAccount(String n, String d) {
		name = n;
		dob = d;
		balance = 0;
	}

	// Accessors
	public String getName() {
		return name;
	}
	public String getDOB() {
		return dob;
	}
	public double getBal() {
		return balance;
	}
	public int getAccNum() {
		return accountNum;
	}

	// Mutator
	public void setAccNumber(int x) {
		accountNum = x;
	}

	final static StringBuilder generatePassword() {
		// A method that generates a secure, random password for the new account based on a given set of characters.
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
	         
	     return password;
	    }
		
		
//		Random generator = new Random();
//		int Password;
//		Password = generator.nextInt();
//		if (Password < 0) {
//			Password = Password * (-1);
//		}
//		return Password;
//	}

	public static boolean verify(String fileName, String fileDOB, String newName, String newDOB) {

		// Return false if duplicate
		if (fileName.equals(newName) && fileDOB.equals(newDOB)) {
			return false;
		} else
			return true;
	}

	public static int getNewMaxAccNum() {
		return ++maxAccountNumber;
	}

	public static void createAccount(String newName, String newDOB, double newBal, int newAccountNumber) {
		try {
			FileOutputStream fos = new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/HW02/accountInfo.txt", true);

			try (PrintWriter pw = new PrintWriter(fos)) {
				pw.print(newName + ", " + newDOB + ", " + newBal + ", " + newAccountNumber + "\n");
				pw.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {// Ask user for info to create account
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter name:");
			String newName = kb.nextLine();

			System.out.println("Enter Date of Birth (Format ##/##/####): ");
			String newDOB = kb.nextLine();

			// Constructors should be defined to handle different scenarios, such as
			// creating an account with or without an initial deposit
			System.out.println("Do you have a initial deposit? (y/n):");
			char ans = kb.next().charAt(0);
			double newBal;
			NewAccount newUserAccount;

			if (ans == 'n' || ans == 'N') {
				System.out.println();
				newUserAccount = new NewAccount(newName, newDOB);

			} else if (ans == 'y' || ans == 'Y') {
					System.out.print("Enter Initial Deposit: $");
					newBal = kb.nextDouble();
					newUserAccount = new NewAccount(newName, newDOB, newBal);

				} else {
						System.out.println("Invalid input, you need to type in the letter 'y' or the letter 'n'.");
						System.exit(0);
						newUserAccount = new NewAccount(newName, newDOB); //this line never runs, only implemented to avoid error later in the code
				}

			// Check if information is duplicate and read account number so that it can be incremented
			try {
				FileInputStream fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/HW02/accountInfo.txt");
				try (Scanner read = new Scanner(fis)) {
					while (read.hasNext()) { 					// while there's more in file
						
						String line = read.nextLine();
						
						if (!line.isBlank()) { 	// if line is not blank, keep going. If line is blank, go to line 128 and go read the next line
							String[] split = line.split(", ");
							String fileName = split[0];
							String fileDOB = split[1];
							String AccNum = split[3];

							// Update maxAccountNum if needed
							if (Integer.parseInt(AccNum) >= maxAccountNumber) {
								maxAccountNumber = Integer.parseInt(AccNum);
							}

							if (!verify(fileName, fileDOB, newUserAccount.getName(), newUserAccount.getDOB())) { // check if account exists
								System.out.println("Account already exists");
								System.exit(0);
							}
						}
						newUserAccount.setAccNumber(getNewMaxAccNum()); // Set account number if account is valid
					}
				}
				createAccount(newUserAccount.getName(), newUserAccount.getDOB(), newUserAccount.getBal(),
						newUserAccount.getAccNum());

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (InputMismatchException e) {
			System.out.println("Error in input type!");
			System.exit(0);
		}

		System.out.println("Your account has been created.");
		System.out.println("Your password is: " + generatePassword());
	}
}
