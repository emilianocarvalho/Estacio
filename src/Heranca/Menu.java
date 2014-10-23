package Heranca;

public class Menu {
	
	public void getMenu(String tipo) {
		System.console();		
		System.out.println("\nExtrato " + tipo);

		/* menu */
		System.out.println("\nMENU DE OPCOES");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Extrato");
		System.out.println("\n0 - Sair");		
	}
}
