package course;

import java.util.Scanner;

public class Exe07EstruturaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
	sc.close();
	}

}
