package Empresa;

public class Analista extends Funcionario {

	@Override
	public double calcBonific() {
		setBonifica��o(this.getSalario() * 15 / 100);
		return this.getBonifica��o();
	}

}
