package Hw03_Nov;

import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class Account {

	protected static StringBuilder generatePassword() { // called by NewAccount
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

	protected String[] readAccount(String name) { // called by AccessAccount
		String[] data = null;
		try (Scanner scanner = new Scanner(
				new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/balanceSheet.txt"))) {

			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				if (line.isEmpty()) {
					continue;
				}
				String[] array = line.split(",");

				if (array.length > 0 && array[0].equals(name)) {
					data = array;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public boolean checkAccount(String name, String password) { // called by AccessAccount
		try (Scanner scanner = new Scanner(
				new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/accountInfo.txt"))) {
			while (scanner.hasNext()) {

				String[] data = scanner.nextLine().split(", ");
				String FileName = data[0];
				String FilePassword = data[1];

				if (FileName.equals(name) && FilePassword.equals(password)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
}
