/**
* BalancoTrimestral
*
* @version v 0.1 Agosto/2014
* @author CARVALHO, Emiliano
*/
package Exercicio1;

public class BalancoTrimestral {
    
    private int gastosJan;
    private int gastosFev;
    private int gastosMar;

    public void setGastosJan(int gastosJan) {
	this.gastosJan = gastosJan;
	System.out.println("\nGastos JAN = " + this.gastosJan);	
    }
    public void setGastosFev(int gastosFev) {
	this.gastosFev = gastosFev;
	System.out.println("\nGastos FEV = " + this.gastosFev);	
    }
    public void setGastosMar(int gastosMar) {
	this.gastosMar = gastosMar;
	System.out.println("\nGastos MAR = " + this.gastosMar);	
    }
    
    public int calcGastosTrimestre() {
	return gastosJan + gastosMar + gastosFev;
    }
    
}
