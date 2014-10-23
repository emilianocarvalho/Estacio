package Polimorfismo;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	@Override
	public void setNome(String nome) {
		this.razaoSocial = nome;		
	}

	@Override
	public String getNome() {		
		return this.razaoSocial;
	}
	
}
