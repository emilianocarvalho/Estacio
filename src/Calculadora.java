/**
 * Calculadora
 *
 * @version v 0.1 Agosto/2014
 * @author CARVALHO, Emiliano
 */
package Exercicio1;

public class Calculadora {

    public int somar(int v1, int v2) {
	return v1 + v2;
    }

    public int subtrair(int v1, int v2) {
	return v1 - v2;
    }
    
    public int multiplicar(int v1, int v2) {
	return v1 * v2;
    }
    
    public int dividir(int v1, int v2) {
	int resultado = 0;
	
	try {
	    resultado =  v1 / v2;
	} catch (ArithmeticException e) {
	    System.out.println("Divisão por zero!");
	}
	
	return resultado;
    }
}
