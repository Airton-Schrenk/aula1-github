package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorII;

public class ProgramRadius {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
				
		double c = CalculatorII.circumference(radius);
		
		double v = CalculatorII.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorII.PI);
		
		sc.close();
	}
}
