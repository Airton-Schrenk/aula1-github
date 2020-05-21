package course;

import java.util.Scanner;

public class Exe01ProposCo {
	//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		if(n1 < 0){
			System.out.printf("NEGATIVO = %d", n1);
		}else{
			System.out.printf("POSITIVO = %d", n1);
		}
		sc.close();

	

	}

}
