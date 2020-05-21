package course;

import java.util.Scanner;

public class Exe03EstrutForII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MÉDIA PONDERADA: Programa que leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. 
		Scanner sc = new Scanner(System.in);
	      System.out.println("Digite um número inteiro:");
	      int n = sc.nextInt();
	            
	    	for (int i = 0; i <= n; i++){
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();

	        double media = (a * 2.0 + b * 3.0 + c * 5.0)/10.0;
			 
		      System.out.printf("%.1f%n", media);
	      }      
		sc.close();
		}

}
