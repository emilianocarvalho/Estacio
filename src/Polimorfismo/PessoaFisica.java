package Polimorfismo;

public class PessoaFisica extends Pessoa{
	private String nome;
	@Override
	public void setNome(String nome) {
		this.nome = nome;		
	}

	@Override
	public String getNome() {
		return this.nome;
	}

}
