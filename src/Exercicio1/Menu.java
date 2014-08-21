/**
 * Menu
 *
 * @version v 0.1 Agosto/2014
 * @author CARVALHO, Emiliano
 */
package Exercicio1;

import java.util.Scanner;

public class Menu {

    public static void menu() {
	System.console();		
	System.out.println("\nExercicios Java");

	/* menu */
	System.out.println("\nMENU DE OPCOES");
	System.out.println("1 - Mensagem");
	System.out.println("2 - Soma 2 valores");
	System.out.println("3 - Balanco Trimestral");
	System.out.println("4 - Array 5 numeros");
	System.out.println("5 - Array 10 numeros inversa");
	System.out.println("6 - Calculadora");
	System.out.println("\n0 - Sair");

    }

    public static void main(String[] args) {
	int opcao = 999;

	while (opcao != 0) {

	    menu();

	    Scanner sc = new Scanner(System.in);
	    opcao = sc.nextInt();

	    switch (opcao) {
	    case 1:
		/* print the famous Hello World! */
		System.out.println("\nMensagem!");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
		HelloWorld fale = new HelloWorld();
		fale.Hello();
		break;
	    case 2:
		/* Some 2 valors */
		System.out.println("\n1 - Soma 2 valores");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
		SomaDoisValores somar = new SomaDoisValores();
		somar.setValor1(4);
		somar.setValor2(3);
		System.out.println("Soma = " + somar.someValores());
		break;
	    case 3:
		/* Balanço trimestral */
		System.out.println("\n2 - Balanco Trimestral");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");

		BalancoTrimestral balanco = new BalancoTrimestral();

		balanco.setGastosJan(15000);
		balanco.setGastosFev(23000);
		balanco.setGastosMar(17000);

		System.out.println("\nBalanco Trimestral = "
			+ balanco.calcGastosTrimestre());
		break;
	    case 4:
		/* Array 5 números inteiros */
		System.out.println("\n3 - Array 5 numeros inteiros");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");

		ArrayInteiros valores = new ArrayInteiros(5);

		valores.setNumber(1);
		valores.setNumber(2);
		valores.setNumber(3);
		valores.setNumber(4);
		valores.setNumber(5);
		valores.mostre();
		break;
	    case 5:
		/* Array 10 números inteiros */
		System.out.println("\n3 - Array 10 numeros em ordem inversa");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");

		OrdemInversa inversa = new OrdemInversa(10);
		
		for (int i = 0; i < 10; i++) {
		    inversa.setNumber(i*2);		    
		}
		
		inversa.mostre();
		break;
		
	    case 6:
		
		Calculadora calc = new Calculadora();
		int opc = 999;
		
		while (opc != 0) {

		    System.out.println("\nCALCULADORA - MENU DE OPCOES");
		    System.out.println("1 - Somar");
		    System.out.println("2 - Subtrair");
		    System.out.println("3 - Multiplicar");
		    System.out.println("4 - Dividir");
		    System.out.println("0 - Sair");

		    opc = sc.nextInt();
		    int val1, val2;
		    switch (opc) {
		    case 1:

			System.out.println("\nSOMAR");
			System.out.println("Digite o primeiro valor: ");
			val1 = sc.nextInt();

			System.out.println("Digite o segundo valor: ");
			val2 = sc.nextInt();

			System.out.println("Resultado: " + calc.somar(val1, val2));
			break;

		    case 2:

			System.out.println("\nSUBTRAIR");
			System.out.println("Digite o primeiro valor: ");
			val1 = sc.nextInt();

			System.out.println("Digite o segundo valor: ");
			val2 = sc.nextInt();

			System.out.println("Resultado: " + calc.subtrair(val1, val2));
			break;
		    case 3:

			System.out.println("\nMULTIPLICAR");
			System.out.println("Digite o primeiro valor: ");
			val1 = sc.nextInt();

			System.out.println("Digite o segundo valor: ");
			val2 = sc.nextInt();

			System.out.println("Resultado: " + calc.multiplicar(val1, val2));
			break;
		    case 4:

			System.out.println("\nDIVIDIR");
			System.out.println("Digite o primeiro valor: ");
			val1 = sc.nextInt();

			System.out.println("Digite o segundo valor: ");
			val2 = sc.nextInt();

			System.out.println("Resultado: " + calc.dividir(val1, val2));
			break;

		    case 0:
			System.out.println("\nFIM - CALCULADORA");
			opc = 0;
			break;
		    }

		}

		break;

	    default:
		break;
	    }
	}
	System.out.println("Fim");
    }
}
