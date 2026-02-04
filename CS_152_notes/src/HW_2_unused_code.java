
public class HW_2_unused_code {



	//createAccount(newName, newDOB, newBal, newAccountNumber() );

			
	/**
	 * public static int newAccountNumber() {
			int accountnum = 0;
			
			try {
				FileInputStream fis = new FileInputStream("/Users/jacobrulka/eclipse-workspace/CS_152_HW/src/HW02/accountInfo.txt");
				Scanner kb = new Scanner(fis);
				
				String[] split = null;
				while(kb.hasNextLine() ){ 			
					String line = kb.nextLine(); 
					
					//Skip over empty lines if any.
					while(line.isBlank()) {
						line = kb.nextLine();
					}
					split = line.split(", "); 				
					
					//String.valueOf(split[0]);
					//String.valueOf(split[1]);
					//String.valueOf(split[2]);
					String.valueOf(split[3]);			
				}
				
				accountnum = Integer.parseInt(split[3]);
				accountnum = accountnum + 1;
				return accountnum;
				
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			return accountnum;
		}
	 * 
	 */
			
			
			//Saw no duplicates, so createAccount()
				
				
//				
//				FileOutputStream fos = new FileOutputStream("accountInfo.txt");
//				PrintWriter pw = new PrintWriter(fos);
//				pw.append(createAccount(newName, newDOB, newBal);
//				pw.write(createAccount(newName, newDOB, newBal);
				
				
				
				/**
				 * for(int i = 0; i < line.length; i++) { // input Accounts[] into txt file 
					pw.print(line);
//					pw.print(", " + i);
					pw.println();
					pw.
				}
					pw.println(NewAccount.createAccount(newDOB, newDOB, newBal));
				 */
				
				
	//String Bal = split[2]; 			// not needed

			
			
			
			
			
			
			
//			System.out.println("Enter name: ");
//			Name = kb.nextLine();
//			
//			System.out.println("Date Month of birth: (format ##)");
//			mm = kb.nextInt();	
//			//MM.equals(mm);
	//
//				if (mm>=13 || mm <0) {
//					System.out.println("Invalid input");
//					System.exit(0);
//				}
//			
//			
//			System.out.println("Date Day of birth: (format ##)");
//			dd = kb.nextInt();
//			//DD.equals(dd);
//			
//				if (dd>= 32 || dd<0){                        // day range 0-31
//					System.out.println("Invalid input");
//					System.exit(0);
//				}
//				if (dd>= 30 && mm == 02) { // assume leap year, feb
//					System.out.println("Invalid date");
//					System.exit(0);
//				}
//				if (dd == 31) {												// when there can't be 31 days
//					if (mm == 04 || mm == 06 || mm == 9 || mm == 11) {
//						System.out.println("Invalid date");
//						System.exit(0);
//					}
//				}
				
//			DOB = MM + "/" + DD + "/" + YEAR;
			
			
//			System.out.println("Date Year of birth: (format ####)");
//			year = kb.nextInt();
//			//YEAR.equals(year);
//				if (year >= 2007) {
//					System.out.println("Too young to open a bank account, you need to be atleast 18!");
//					System.exit(0);
//				}
//			
//			System.out.println("Enter your initial Deposit: $");
//			Deposit = kb.nextDouble();
			


			
		//	System.out.println(acc.createAccount());
}
