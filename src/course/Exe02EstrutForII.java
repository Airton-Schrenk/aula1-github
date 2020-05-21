package course;

import java.util.Scanner;

public class Exe02EstrutForII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que leia um número inteiro N. Este valor será a quant. de valores inteiros X que serão lidos em seguida.
			       
	    Scanner sc = new Scanner(System.in);
	      System.out.println("Digite um número inteiro:");
	      int n = sc.nextInt();
	      int in = 0;
	      int out = 0;
	      
	    	for (int i = 1; i <= n; i++){
	        int x = sc.nextInt();
	        if(x >=10 && x <= 20){
	          in = in + 1;
	        }else{
	          out = out + 1;
	        }
			 
		    }
	      System.out.println(in + " in");
	      System.out.println(out + " out");
		sc.close();
		}
	}

