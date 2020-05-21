package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		System.out.print("Enter account mumber: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an iniitial deposit (y or n)");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value :");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder,initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
