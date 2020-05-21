package course;

import java.util.Locale;
import java.util.Scanner;

public class Exe05EstrutSeq {

	public static void main(String[] args) {
		// Valor total dos produtos
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double vlrTotal;

		System.out.println("Cálculo do valor total a pagar das peças! \n");
		System.out.println("Digite o código da peça : \n");
		int cod1 = sc.nextInt();
		System.out.println("Digite a quant de peças: \n");
		int qtdpca1 = sc.nextInt();
		System.out.println("Digite o valor unitário: \n");
		sc.nextLine();
		double vlrUnpca1 = sc.nextDouble();

		System.out.println("Digite o código da peça : \n");
		int cod2 = sc.nextInt();
		System.out.println("Digite a quant de peças: \n");
		int qtdpca2 = sc.nextInt();
		System.out.println("Digite o valor unitário: \n");
		sc.nextLine();
		double vlrUnpca2 = sc.nextDouble();	
				
		vlrTotal = qtdpca1 * vlrUnpca1 + qtdpca2 * vlrUnpca2;
		System.out.printf("codigo %d\n", cod1);
		System.out.printf("codigo %d\n", cod2);
		System.out.printf("O valor total a pagar do código é R$ %.2f", vlrTotal);
		sc.close();

	}

}
