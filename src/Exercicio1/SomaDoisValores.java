/**
* SomaDoisValores
*
* @version v 0.1 Agosto/2014
* @author CARVALHO, Emiliano
*/
package Exercicio1;

public class SomaDoisValores {
    // some 2 values
    private int valor1;
    private int valor2;

    public void setValor1(int valor) {
	this.valor1 = valor;
	System.out.println("Adicionado o valor 1 = " + valor1);
    }

    public void setValor2(int valor) {
	this.valor2 = valor;
	System.out.println("Adicionado o valor 2 = " + valor2);
    }


    public int someValores() {
	return valor1 + valor2;
    }
}
