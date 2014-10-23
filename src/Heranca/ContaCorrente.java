package Heranca;

public class ContaCorrente extends Conta {
	public boolean atualiza(double taxa) {
		if (taxa > 0) {
			this.saldo += this.saldo * ((taxa*2) / 100);
			return true;
		} else {
			return false;
		}
	}
}
