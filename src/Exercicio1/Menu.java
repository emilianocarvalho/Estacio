package Exercicio1;


public class Menu {

    public static void main(String[] args) {

	System.out.println("Exercícios Java");

	// print the famous Hello World!
	System.out.println("\nMensagem!");		
	System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
	HelloWorld fale = new HelloWorld();
	fale.Hello();

	// Some 2 valors
	System.out.println("\n1 - Soma 2 valores");
	System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
	SomaDoisValores somar = new SomaDoisValores();		
	somar.setValor1(4);
	somar.setValor2(3);		
	System.out.println("Soma = " + somar.someValores());

	// Balanço trimestral
	System.out.println("\n2 - Balanco Trimestral");		
	System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
	BalancoTrimestral balanco = new BalancoTrimestral();
	balanco.setGastosJan(15000);
	balanco.setGastosFev(23000);
	balanco.setGastosMar(17000);
	System.out.println("\nBalanço Trimestral = " + balanco.calcGastosTrimestre());

	// Array 5 números inteiros
	System.out.println("\n3 - Array 5 números inteiros");		
	System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
	ArrayInteiros valores = new ArrayInteiros(5);
	
	valores.setNumber(1);
	valores.setNumber(2);
	valores.setNumber(3);
	valores.setNumber(4);
	valores.setNumber(5);
	valores.mostre();
	
	System.out.println("Fim");


    }

}
