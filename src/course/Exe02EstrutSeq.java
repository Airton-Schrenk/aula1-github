package course;

import java.util.Locale;
import java.util.Scanner;

public class Exe02EstrutSeq {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		double area, pi = 3.14159;
		area = pi * (raio * raio);
		System.out.printf("O valor da área é %.4f", area);
		sc.close();
	}

}
