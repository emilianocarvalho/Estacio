package Heranca;

import java.util.Scanner;

public class TestaContas {

	private static Scanner sc, ler;

	public static void menu() {
		System.console();		
		System.out.println("\nAcesso Conta");

		/* menu */
		System.out.println("\nMENU DE OPCOES");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupança");
		System.out.println("\n0 - Sair");

	}

	public static void main(String[] args) {

		int opcao = 999;

		while (opcao != 0) {

			menu();

			sc = new Scanner(System.in);
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				/* depósito conta corrente */
				int op1 = 999;
				while (op1 != 0) {

					ContaCorrente cc = new ContaCorrente();
					Menu menuCC = new Menu();

					menuCC.getMenu("Conta Corrente");

					int opCC = sc.nextInt();
					ler = new Scanner(System.in);

					switch (opCC) {
					case 1:
						cc.deposita(ler.nextDouble());
						break;
					case 2:
						cc.saca(ler.nextDouble());
						break;
					default:
						op1 = 0;
					}
				}
				break;
			case 2:
				/* depósito conta poupanca */
				int op2 = 999;
				while (op2 != 0) {

					ContaPoupanca cp = new ContaPoupanca();
					Menu menuCP = new Menu();

					menuCP.getMenu("Conta Poupança");

					int opCP = sc.nextInt();
					ler = new Scanner(System.in);

					switch (opCP) {
					case 1:
						cp.deposita(ler.nextDouble());
						break;
					case 2:
						cp.saca(ler.nextDouble());
						break;
					default:
						op2 = 0;
					}				
				}
				break;
			}
		}
	}
}
