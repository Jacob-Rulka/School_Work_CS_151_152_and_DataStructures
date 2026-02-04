package Hw03_Nov;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;

public class AccessAccount extends Account {

	public void deposit(String name, String password, double amount) {
		if (super.checkAccount(name, password)) {
			try {
				String[] data = super.readAccount(name); // balance sheet

				double FileBal = Double.parseDouble(data[5]);
				double newBalance = FileBal + amount;

				try (PrintWriter pw = new PrintWriter(new FileOutputStream(
						"/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/balanceSheet.txt", true))) {
					pw.println(name + ", " + data[1] + ", " + amount + ", deposit, " + LocalDate.now() + ", " + newBalance);
				}

				System.out.println("Deposit successful. New Balance: " + newBalance);
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Account verification failed. Deposit not processed.");
			System.out.println();
		}
	}

	public void withdraw(String name, String password, double amount) {
		if (super.checkAccount(name, password)) {
			try {
				String[] data = super.readAccount(name); // balance sheet
				double currentBalance = Double.parseDouble(data[5]);
				if (currentBalance >= amount) {
					double newBalance = currentBalance - amount;

					try (PrintWriter pw = new PrintWriter(new FileOutputStream(
							"/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/balanceSheet.txt", true))) {
						pw.println(name + ", " + data[1] + ", " + amount + ", withdraw, " + LocalDate.now() + ", " + newBalance);
					}

					System.out.println("Withdrawal successful. New Balance:" + newBalance);
					System.out.println();
				} else {
					System.out.println("Insufficient funds.");
					System.out.println();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Account verification failed. Withdrawal not processed.");
			System.out.println();
		}
	}
}
