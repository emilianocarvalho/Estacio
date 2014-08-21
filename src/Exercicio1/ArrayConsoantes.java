/**
 * ArrayConsoantes
 *
 * @version v 0.1 Agosto/2014
 * @author CARVALHO, Emiliano
 */
package Exercicio1;

public class ArrayConsoantes {
    protected char [] vetor;
    protected int tam;
    
    public ArrayConsoantes() {
	tam = 0;
    }
    
    public ArrayConsoantes(int quantidade) {
	this.vetor = new char[quantidade];
    }
    
    public void setLetra(char caracter) {
	vetor[tam] = caracter;
	tam++;
    }
    
    public void mostre() {
	int cont = 0;
	String consoantes = "";
	System.out.println("CONSOANTES");
	for (int i = 0; i < vetor.length; i++) {
	    char letra = vetor[i];
	    if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
		cont++;
		consoantes += vetor[i] + " ";
	    }
	}
	System.out.println("Quantidade lida: " + cont);
	System.out.println("Consoantes encontradas: " + consoantes);	
    }
}
