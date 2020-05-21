package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorPen;

public class PensaoLiquida {

	public static void main(String[] args) {
		//Cálculo da pensão Líquida
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor da Cota pensão? ");
		double cotaPen = sc.nextDouble();
		
		System.out.print("Qual o valor do IRRF? ");
		double irrf = sc.nextDouble();
		
		System.out.print("Qual o valor da Previdência: ");
		double previd = sc.nextDouble();
		
		double result = CalculatorPen.liqPen(cotaPen, irrf, previd);
		
		System.out.printf("O valor da pensão líquida é de R$ %.2f%n", result);
		sc.close();
	}

}
