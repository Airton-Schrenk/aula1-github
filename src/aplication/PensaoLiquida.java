package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorPen;

public class PensaoLiquida {

	public static void main(String[] args) {
		//C�lculo da pens�o L�quida
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor da Cota pens�o? ");
		double cotaPen = sc.nextDouble();
		
		System.out.print("Qual o valor do IRRF? ");
		double irrf = sc.nextDouble();
		
		System.out.print("Qual o valor da Previd�ncia: ");
		double previd = sc.nextDouble();
		
		double result = CalculatorPen.liqPen(cotaPen, irrf, previd);
		
		System.out.printf("O valor da pens�o l�quida � de R$ %.2f%n", result);
		sc.close();
	}

}
