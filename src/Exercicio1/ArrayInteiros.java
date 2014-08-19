package Exercicio1;

public class ArrayInteiros {
    private int [] number;
    private int tam;
    
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
	    System.out.println("Número " + i + " é = " + number[i]);
	}
    }
}
