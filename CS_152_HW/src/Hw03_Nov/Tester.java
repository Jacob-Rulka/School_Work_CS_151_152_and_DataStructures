package Hw03_Nov;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int choice = 0;
		Scanner kb = new Scanner(System.in);

		do {
			try {
				System.out.println("Enter your choice (1-5):");
				System.out.println("1. Create a new account without deposit");
				System.out.println("2. Create a new account with deposit");
				System.out.println("3. Deposit an amount to an existing account");
				System.out.println("4. Withdraw an amount from an existing account");
				System.out.println("5. Exit");

				System.out.print("Enter your choice: ");
				choice = kb.nextInt();
				kb.nextLine();

				switch (choice) {

				case 1: // new account without deposit
					String newName;
					System.out.print("  Enter your name (First and Last): ");
					newName = kb.nextLine();

					String newDOB;
					System.out.print("Enter Date of Birth (Format ##/##/####): ");
					newDOB = kb.nextLine();
					createAccount(newName, newDOB);
					break;

				case 2: // new account with deposit
					String newName1;
					System.out.print("Enter your name (First and Last): ");
					newName1 = kb.nextLine();

					System.out.print("Enter Date of Birth (Format ##/##/####): ");
					String newDOB1 = kb.nextLine();

					double initialDeposit;
					System.out.print("Enter initial deposit amount ($): ");
					initialDeposit = kb.nextDouble();

					createAccount(newName1, newDOB1, initialDeposit);
					break;

				case 3: // deposit
					System.out.print("Enter your name: ");
					String name = kb.nextLine();

					System.out.print("Enter password: ");
					String password = kb.nextLine();

					System.out.print("Enter amount to deposit ($): ");
					double amount = kb.nextDouble();
					kb.nextLine();

					depositToAccount(name, password, amount);
					break;

				case 4: // withdraw
					System.out.print("Enter your name: ");
					String name1 = kb.nextLine();

					System.out.print("Enter password: ");
					String password1 = kb.nextLine();

					System.out.print("Enter amount to withdraw ($): ");
					double amount1 = kb.nextDouble();
					kb.nextLine();

					withdrawFromAccount(name1, password1, amount1);
					break;

				case 5: // exit
					System.out.println("You have exited");
					System.exit(0);

				default:
					System.out.println("Invalid choice, please select between 1 and 5.");
					System.out.println();
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				kb.nextLine();
			}
		} while (choice != 5);

		kb.close();
	}

	private static void createAccount(String newName, String newDOB) {
		double initialDeposit = 0;
		NewAccount newAccount = new NewAccount(newName, newDOB, initialDeposit);
		newAccount.createNewAccount(newDOB, newDOB);
	}

	private static void createAccount(String newName, String newDOB, double initialDeposit) {
		NewAccount newAccount = new NewAccount(newName, newDOB, initialDeposit);
		newAccount.createNewAccount(newDOB, newDOB, initialDeposit);
	}

	private static void depositToAccount(String name, String password, double amount) {
		AccessAccount accessAccount = new AccessAccount();
		accessAccount.deposit(name, password, amount);
	}

	private static void withdrawFromAccount(String name, String password, double amount) {
		AccessAccount accessAccount = new AccessAccount();
		accessAccount.withdraw(name, password, amount);
	}

}
