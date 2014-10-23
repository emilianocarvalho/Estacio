package Polimorfismo;

public class TestaPessoa {

	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("João Batista");
		System.out.println(pessoaFisica.getNome());

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Estácio");
		System.out.println(pessoaJuridica.getNome());
	}
}
