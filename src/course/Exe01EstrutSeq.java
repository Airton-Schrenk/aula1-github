package course;

import java.util.Scanner;

public class Exe01EstrutSeq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
				
		System.out.println("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		double x1 = (n1 + n2);
		System.out.printf("a soma � %.2f", x1);
		sc.close();
	}

}
