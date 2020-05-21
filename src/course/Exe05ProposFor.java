package course;

import java.util.Scanner;

public class Exe05ProposFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um número:");
			int n = sc.nextInt();

			int fat = 1;
			for(int i = 1; i<=n; i++){
			      fat = fat * i;
			}

			System.out.println(fat);

			sc.close();
			
	}

}
