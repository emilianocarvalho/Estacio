package Exercicio3;

public class Conta {
    private String nome;
    private String conta;
    private double saldo;

    public void setNome(String nome) {
	this.nome = nome;
    }

    public void getInfo() {
	System.out.println("Cliente: " + nome + "\nConta: " + conta + "\nSaldo: " + saldo);
    }

    public void setConta(String conta) {
	this.conta = conta;
    }

    public boolean saca(double valor){
	if (this.saldo < valor) {
	    return false;
	} else {
	    this.saldo = this.saldo - valor;
	    return true;
	}
    }

    public void deposita(double valor){
	this.saldo = this.saldo + valor;
    }	

}
