package Heranca;

public class Conta {
	protected double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void extrato(String operacao) {
		System.out.println("EXTRATO DE CONTA");
		System.out.println("Saldo: " + getSaldo());
		System.out.println(operacao);
	}
	
	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			extrato("Depósito ..." + valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if (valor < this.saldo) {
			this.saldo -= valor;
			extrato("Saque ......" + valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean atualiza(double taxa) {
		if (taxa > 0) {
			this.saldo += this.saldo * (taxa / 100);
			extrato("Atualizado em " + taxa + "%");
			extrato("");
			return true;
		} else {
			return false;
		}
	}
}
