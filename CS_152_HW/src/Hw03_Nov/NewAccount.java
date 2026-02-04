package Hw03_Nov;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class NewAccount extends Account  {

	
    private String name;
    private String dob;
    private double balance;
    private int accountNum;
    private static int maxAccountNumber = 1000000;

    public NewAccount(String name, String dob) {
        this.name = name;
        this.dob = dob;
        this.balance = 0.0;
    }

    public NewAccount(String newName, String dob, double balance) {
        this.name = newName;
        this.dob = dob;
        this.balance = balance;
    }

    
    private static int getNewMaxAccNum() {
        return ++maxAccountNumber;
    }
    
    private static int getNewMaxAccNum(int AccNum) {
    	if (AccNum == 0) {
    		AccNum = 1000000;
    	}
    		
    	return ++AccNum;
    }

    public void createNewAccount(String name, String dob) {
        StringBuilder password = super.generatePassword();
      //  this.accountNum = getNewMaxAccNum();

        try {
            FileInputStream fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/accountInfo.txt");
            try (Scanner scanner = new Scanner(fis)) {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    String[] data = line.split(", ");
                    
                    int AccNum = Integer.parseInt(data[2]);
                    this.accountNum = getNewMaxAccNum(AccNum);

                    
                    if (data[0].equals(this.name) && data[3].equals(this.dob)) {
                        System.out.println("Account already exists for this name and DOB.");
                        System.exit(0);
                    }
                }
            }

            try (PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/accountInfo.txt", true))) {
                pw.println(this.name + ", " + password + ", " + this.accountNum + ", " + this.dob + ", ");
            }
            
            try (PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/balanceSheet.txt", true))) {
                pw.println( this.name + ", " + this.accountNum + ", " + this.balance + ", deposit, " + LocalDate.now() + ", " + this.balance);
            }

            System.out.println("Account created successfully! Account Number: " + this.accountNum + " Password: " +  password + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createNewAccount(String name, String dob, double balance) {
        StringBuilder password = super.generatePassword();

        try {
            FileInputStream fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/accountInfo.txt");
            try (Scanner scanner = new Scanner(fis)) {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    String[] data = line.split(", ");
                    
                    int AccNum = Integer.parseInt(data[2]);
                    this.accountNum = getNewMaxAccNum(AccNum);
                    
                    if (data[0].equals(this.name) && data[3].equals(this.dob)) {
                        System.out.println("Account already exists for this name and DOB.");
                        System.exit(0);
                    }
                }
            }

            try (PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/accountInfo.txt", true))) {
                pw.println(this.name + ", " + password + ", " + this.accountNum + ", " + this.dob + ", ");
            }

            try (PrintWriter pw = new PrintWriter(new FileOutputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/Hw03_Nov/balanceSheet.txt", true))) {
                pw.println(this.name + ", " + this.accountNum + ", "+ this.balance + ", deposit, " + LocalDate.now() + ", " + this.balance);
            }

            System.out.println("Account created successfully! Account Number: " + this.accountNum + " Password: " +  password + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
