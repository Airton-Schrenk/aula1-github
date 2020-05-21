package course;

import java.util.Scanner;

public class Exe01Secao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			int produto = i * N;
			
			System.out.println(i + " x " + N + " = " + produto);
		}
		sc.close();
	}

}
