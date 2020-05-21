package aplication;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pensionista;
import entities.FilhoInvalido;
import entities.FilhoMenor;
import entities.Viuva;


public class Main{
	
	public static void main(String[]args)throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pensionista> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de pensionistas:");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Pensionista #" + i + "dados:");
			System.out.print("Viúva - FilhoInval - FilhoMenor (v/i/m)?");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("base valor pensão: ");
			double baseValorPens = sc.nextDouble();
			if(type == 'v') {
				System.out.print("Percentual viúva");
				double percentualViuva = sc.nextDouble();
				list.add(new Viuva(name, baseValorPens, percentualViuva));
			}if(type == 'i') {
				System.out.print("Valor Inválido");
				double tetoRGPS = sc.nextDouble();
				list.add(new FilhoInvalido(name, baseValorPens, tetoRGPS));
			}if(type == 'm') {
				System.out.print("Valor Filho Menor");
				double percentualAdicional = sc.nextDouble();
				list.add(new FilhoMenor(name, baseValorPens, percentualAdicional));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pensionista tp : list) {
			double baseFinal = tp.baseFinal();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", baseFinal));
			sum += baseFinal;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
