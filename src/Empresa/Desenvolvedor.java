package Empresa;

public class Desenvolvedor extends Funcionario {

	@Override
	public double calcBonific() {
		setBonificação(this.getSalario() * 10 / 100);
		return this.getBonificação();
	}

}
