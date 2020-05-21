package course;

import java.util.Locale;
import java.util.Scanner;

public class Exe06EstrutSeq {

	public static void main(String[] args) {
		//
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, aTretang, aCirculo, aTrapezio, aQuadrado, aRetangulo, pi = 3.14159;

		System.out.println("Cálculo da área de figuras geométricas! \n");
		System.out.println("Digite o valor de A: \n");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B:\n");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: \n");
		C = sc.nextDouble();
		
		aTretang = A * C / 2.0;                   //A = BASE E C = ALTURA
		aCirculo = pi * (C * C);                //C = RAIO
		aTrapezio = ((A + B) * C) / 2.0;		//A = B MENOR B= B MAIOR E C= ALTURA
		aQuadrado = B * B;
		aRetangulo = A * B;			
				
		System.out.printf("Área Triang Ret %.3f%n", aTretang);
		System.out.printf("Área do círculo %.3f%n", aCirculo);
		System.out.printf("Área do trapézio %.3f%n", aTrapezio);
		System.out.printf("Área do quadrado %.3f%n", aQuadrado);
		System.out.printf("Área do retângulo %.3f%n", aRetangulo);

		sc.close();

	}

}
