package Pessoas;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		int opcao = 9;
		Scanner sc = new Scanner(System.in);
		while (opcao != 0) {
			System.out.println("|||||||||||||||||||||||||||||||||||");
			System.out.println("1 - Cadastrar pessoa ||||||||||||||");
			System.out.println("2 - Remover pessoa ||||||||||||||||");
			System.out.println("3 - Listar pessoas ||||||||||||||||");
			System.out.println("4 - Resolver problema |||||||||||||");
			System.out.println("0 - Sair ||||||||||||||||||||||||||");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				Pessoa p = new Pessoa();
				System.out.println("Cadastrar Pessoa ||||||||||||||");
				
				System.out.println("Digite seu nome  ||||||||||||||");
				p.setNome(sc.next());
				
				System.out.println("Digite sua idade ||||||||||||||");
				p.setIdade(sc.nextInt());

				System.out.println("Digite seu peso   |||||||||||||");
				p.setPeso(sc.nextDouble());

				p.adicionarPessoa(p);
				
				break;
			case 2:
				break;
			case 3:
				Pessoa.listarPessoas();
				break;
			case 4:
				Pessoa.listarPessoas();
				break;
			case 0:
				return;
			default:
				break;
			}
			
		}
			
		
	}

}
