package Polimorfismo;

public class TestaPessoa {

	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Jo�o Batista");
		System.out.println(pessoaFisica.getNome());

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Est�cio");
		System.out.println(pessoaJuridica.getNome());
	}
}
