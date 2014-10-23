package Empresa;

public class Analista extends Funcionario {

	@Override
	public double calcBonific() {
		setBonificação(this.getSalario() * 15 / 100);
		return this.getBonificação();
	}

}
