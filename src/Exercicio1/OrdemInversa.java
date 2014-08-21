package Exercicio1;

public class OrdemInversa extends ArrayInteiros {
    public OrdemInversa() {
	tam = 0;
    }

    public OrdemInversa(int quantidade) {
	this.number = new int[quantidade];
    }

    public void mostre() {
	
	for (int i = (number.length - 1); i >= 0; --i) {
	    System.out.println("Numero " + i + " eh = " + number[i]);
	}
    }
}
