package Empresa;

public class Gerente extends Funcionario {

	@Override
	public double calcBonific() {
		setBonifica��o(this.getSalario() * 20 / 100);
		return this.getBonifica��o();
	}

}
