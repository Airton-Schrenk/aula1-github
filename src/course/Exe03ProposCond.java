package course;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
public class Exe03ProposCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A % B == 0 || B % A == 0){
			System.out.println("São multiplos");
		}else{
			System.out.println("Não são multiplos");
		}
		sc.close();
	}

}
