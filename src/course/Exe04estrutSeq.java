package course;

import java.util.Locale;
import java.util.Scanner;

public class Exe04estrutSeq {

	public static void main(String[] args) {
		//C�lculo do sal�rio do funcion�rio
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salFunc;

		System.out.println("C�lculo do n�mero e sal�rio de funcion�rio! \n");
		System.out.println("Digite o n�mero do funcion�rio: \n");
		int nf = sc.nextInt();
		System.out.println("Digite a quant de horas trabalhadas: \n");
		int nHT = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: \n");
		double vlrHT = sc.nextDouble();

				
		salFunc = (nHT * vlrHT);
		System.out.printf("O valor do Sal�rio do NF %d � U$ %.2f", nf, salFunc);

		sc.close();
	}

}
