package Empresa;

public class Desenvolvedor extends Funcionario {

	@Override
	public double calcBonific() {
		setBonifica��o(this.getSalario() * 10 / 100);
		return this.getBonifica��o();
	}

}
