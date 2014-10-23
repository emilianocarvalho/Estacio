package Empresa;

public class Gerente extends Funcionario {

	@Override
	public double calcBonific() {
		setBonificação(this.getSalario() * 20 / 100);
		return this.getBonificação();
	}

}
