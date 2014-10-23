package Listas;

import java.util.Scanner;

public class TestePessoa {

	static Pessoa p = new Pessoa();

	public static void main(String[] args) {

		int opcao = 9;
		
		while (opcao != 0) {
			System.out.println("||||||||||||||||||||||||||||||||||");
			System.out.println("1 cadastrar"); 
			System.out.println("2 remover");
			System.out.println("3 listar pessoa");
			System.out.println("0 Sair");

			Scanner sc = new Scanner(System.in);

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite seu nome:");
				String nome = sc.next();
				System.out.println("Digite sua idade:");
				int idade = sc.nextInt();
				System.out.println("Digite sua altura:");
				double altura = sc.nextDouble();


				System.out.println(p.adicionarPessoa(nome, idade, altura));

				break;
			case 2:
				System.out.println("Digite seu nome:");
				String nomeRem = sc.next();


				System.out.println(p.removerPessoa(nomeRem));

				break;
			case 3:
				p.listarPessoa();
				break;

			case 0:
				return;

			default:
				
				break;
			}

		}

	}

}
