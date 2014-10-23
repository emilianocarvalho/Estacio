package Listas;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String adicionarPessoa(String nome, int idade, double altura) {

		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setIdade(idade);
		p.setAltura(altura);

		lista.add(p);

		return p.getNome() + " adicionada com sucesso";
	}

	public String removerPessoa(String nome) {
		String removido = "<não removido>";
				
		for (int i = 0; i < lista.size(); i++) {

			Pessoa p = lista.get(i);

			if (p.getNome().equals(nome)) {
				removido = "<removido>"; 
				lista.remove(p);
			}

		}
		
		return removido;
	}
	
	public void listarPessoa() {
		if (lista.isEmpty()) {
			System.out.println("<vazia>");
		} else {			
			for (int i = 0; i < lista.size(); i++) {
				Pessoa p = new Pessoa();
				p = (Pessoa) lista.get(i);
				System.out.println("<Nome: " + p.getNome() +" Idade: " + p.getIdade() + " Altura: " + p.getAltura() + ">\n");
			}
		}
	}
}
