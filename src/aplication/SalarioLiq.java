package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorSalario;

public class SalarioLiq {
	
	
	public static void main(String[] args) {
		// CALCULADORA SAL�RIO L�QUIDO
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre como sal�rio bruto: ");
		double salario = sc.nextDouble();
		
		double i = CalculatorSalario.calcIrrf(salario);
		
		double p = CalculatorSalario.calcPrevid(salario);
		
		double sl = CalculatorSalario.salLiq(salario);
		
		System.out.printf("Sal�rio Bruto: %.2f%n",sl);
		System.out.printf("Desconto de Previd�ncia: %.2f%n",p);
		System.out.printf("Desconto de IRRF: %.2f%n",i);
		System.out.printf("IRRF: %.2f%n",CalculatorSalario.IRRF);
		
		sc.close();
	}
			
}
