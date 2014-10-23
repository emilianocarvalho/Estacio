package Collections;

import java.util.*;

public class TestaAnimal {

	public static void main(String[] args) {

		Collection colecao = new ArrayList();
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out
					.println("CADASTRO DE ANIMAIS |||||||||||||||||||||||||||");
			Animal animal = new Animal();

			System.out.println("Nome do animal:");
			animal.setNome(sc.next());

			System.out.println("Peso do animal:");
			animal.setPeso(sc.nextDouble());

			System.out.println("Código para o animal:");
			animal.setCodigo(sc.nextInt());

			colecao.add(animal);

			System.out.println("0 - Sair");
			int op = sc.nextInt();

			if (op == 0) {
				break;
			}
		}

		Iterator iteColecao = colecao.iterator();

		while (iteColecao.hasNext()) {

			Animal animalListado = (Animal) iteColecao.next();

			System.out.println("Animal||||||||||||||||||");
			System.out.println("Código: " + animalListado.getCodigo());
			System.out.println("Nome: " + animalListado.getNome());
			System.out.println("Peso: " + animalListado.getPeso());

		}
	}

}
