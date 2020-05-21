package course;

import java.util.Locale;
import java.util.Scanner;

public class Exe04estrutSeq {

	public static void main(String[] args) {
		//Cálculo do salário do funcionário
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salFunc;

		System.out.println("Cálculo do número e salário de funcionário! \n");
		System.out.println("Digite o número do funcionário: \n");
		int nf = sc.nextInt();
		System.out.println("Digite a quant de horas trabalhadas: \n");
		int nHT = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: \n");
		double vlrHT = sc.nextDouble();

				
		salFunc = (nHT * vlrHT);
		System.out.printf("O valor do Salário do NF %d é U$ %.2f", nf, salFunc);

		sc.close();
	}

}
