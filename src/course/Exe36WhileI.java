package course;

import java.util.Scanner;

public class Exe36WhileI {

	public static void main(String[] args) {
		// Leia uma quant indeterminada de duplas de valores
		//inteiros X e Y
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if(x < y) {
				System.out.println("crescente");
				
			}else{
				System.out.println("decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
