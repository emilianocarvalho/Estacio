/**
* ArrayInteiros
*
* @version v 0.1 Agosto/2014
* @author CARVALHO, Emiliano
*/
package Exercicio1;

public class ArrayInteiros {
    protected int [] number;
    protected int tam;
    
    public ArrayInteiros() {
	tam = 0;
    }
    
    public ArrayInteiros(int quantidade) {
	this.number = new int[quantidade];
    }
    
    public void setNumber(int valor) {
	number[tam] = valor;
	tam++;
    }
    
    public void mostre() {	
	for (int i = 0; i < number.length; i++) {
	    System.out.println("Numero " + i + " eh = " + number[i]);
	}
    }
}
