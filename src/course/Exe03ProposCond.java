package course;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
public class Exe03ProposCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A % B == 0 || B % A == 0){
			System.out.println("S�o multiplos");
		}else{
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
	}

}
