package Heranca;

public class ContaPoupanca extends Conta {
	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor + 0.50;
			return true;
		} else {
			return false;
		}
	}
}
