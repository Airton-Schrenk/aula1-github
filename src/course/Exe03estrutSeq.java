package course;

import java.util.Scanner;

public class Exe03estrutSeq {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		int diferenca;
		System.out.println("Digite o quatro n�meros inteiro! \n");
		System.out.println("Digite o primeiro n�mero A: \n");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero B: \n");
		int n2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero C: \n");
		int n3 = sc.nextInt();
		System.out.println("Digite o quarto n�mero D: \n");
		int n4 = sc.nextInt();
		
		diferenca = ((n1 * n2) - (n3 * n4));
		System.out.printf("A diferen�a do produto de A e B pelo produto de C e D � %d", diferenca);

		sc.close();

	}

}
