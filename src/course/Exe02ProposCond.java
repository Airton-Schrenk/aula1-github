package course;

import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
public class Exe02ProposCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		if(n1 %2 == 0){
			System.out.printf("PAR = %d", n1);
		}else{
			System.out.printf("IMPAR = %d", n1);
		}
		sc.close();
	}

}
