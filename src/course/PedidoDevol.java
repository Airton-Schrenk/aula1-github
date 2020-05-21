package course;

import java.util.Scanner;

public class PedidoDevol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do ofício: ");
		int nOficio = sc.nextInt();
		System.out.println("Digite o NF: ");
		int nF = sc.nextInt();
		System.out.println("Digite o NV: ");
		int nV = sc.nextInt();
		System.out.println("Digite o NP: ");
		int nP = sc.nextInt();
		System.out.println("Digite o nome da Pensionista: ");
		sc.nextLine();
		String namePst = sc.nextLine();
		System.out.println("Digite o tipo de folha: ");
		sc.nextLine();
		String folha = sc.nextLine();
		System.out.println("Digite a data atual: ");
		int nDtAtual = sc.nextInt();
		System.out.println("Digite a data do óbito: ");
		int nDtObito = sc.nextInt();
		System.out.println("Digite o número do ROF: ");
		int nROF = sc.nextInt();
		System.out.println("Digite o número do banco: ");
		int nBco = sc.nextInt();
		System.out.println("Digite o número da agência: ");
		int nAg = sc.nextInt();
		System.out.println("Digite o número da conta: ");
		int nCta = sc.nextInt();
		System.out.println("Digite o valor a resgatar: ");
		double vlr = sc.nextDouble();

		System.out.println(nOficio);
		System.out.println(nROF);

		System.out.println(nF);
		System.out.println(nV);
		System.out.println(nP);
		System.out.println(namePst);
		System.out.println(folha);
		System.out.println(nDtAtual);
		System.out.println(nDtObito);
		System.out.println(nROF);
		System.out.println(nBco);
		System.out.println(nAg);
		System.out.println(nCta);
		System.out.println(vlr);
		sc.close();

	}

}
