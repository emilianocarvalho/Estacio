/**
* Menu
*
* @version v 0.1 Agosto/2014
* @author CARVALHO, Emiliano
*/
package Exercicio1;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {

	System.out.println("Exercicios Java");
	// menu
	
	System.out.println("MENU DE OPCOES");
	System.out.println("1 - Mensagem");
	System.out.println("2 - Soma 2 valores");
	System.out.println("3 - Balan�o Trimestral");
	System.out.println("4 - Array 5 n�meros");
	System.out.println("5 - Calculadora");
	
	Scanner sc = new Scanner("System.in");
	int opcao = sc.nextInt();
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
		System.out.println("\nBalan�o Trimestral = " + balanco.calcGastosTrimestre());		
		break;
	case 4:
		/* Array 5 números inteiros */
		System.out.println("\n3 - Array 5 n�meros inteiros");		
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
		System.out.println("MENU DE OP��ES");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");

		opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			Calculadora calc = new Calculadora();

			System.out.println("SOMA");
			System.out.println("Digite o primeiro valor: ");
			int val1 = sc.nextInt();
			System.out.println("Digite o segundo valor: ");
			int val2 = sc.nextInt();
			System.out.println("Resultado: " + calc.somar(val1, val2));
			break;

		default:
			break;
		}
		
		break;

	default:
		break;
	}
	



	
	System.out.println("Fim");


    }

}
