package course;

import java.util.Scanner;

public class Exe01ProposWhile {

	public static void main(String[] args) {
		//Programa que repita a leitura de uma senha até que ela seja válida.
			Scanner sc = new Scanner(System.in);
		    
			  	System.out.println("Enter your password: ");
			  	int senha  = sc.nextInt();

		   		while(senha != 2002){
		     	System.out.print("Password Incorrect! ");
				senha = sc.nextInt();
		     	}

		   		System.out.println("Password Correct!");
				sc.close();
		}
}


