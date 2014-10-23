package Pessoas;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	
	private static ArrayList<Pessoa> lista = new ArrayList<>();
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String adicionarPessoa(Pessoa p) {
	
		lista.add(p);
		
		return "<" + p.getNome() + " adicionada com sucesso>";
	}
	public static String removerPessoa(String nome) {
		String msg = "<não removido>";
		for (int i = 0; i < lista.size(); i++) {
			Pessoa p = lista.get(i);
			if (p.getNome().equals(nome)) {
				lista.remove(p);
				msg = "<removido>";
			}
		}
		return msg;
	}
	public static void listarPessoas(){
		System.out.println("listagem de pessoas |||||||||||||||");
		for (int i = 0; i < lista.size(); i++) {
			Pessoa p = lista.get(i);
			System.out.println("<nome: " + p.getNome() + "| idade: " +  p.getIdade() + "| peso: " + p.getPeso() + ">.");
		}
	}
	public static void resolverProblema(){
		System.out.println("Resolver problema  ||||||||||||||||");
		for (int i = 0; i < lista.size(); i++) {
			Pessoa p = lista.get(i);
			System.out.println("<nome: " + p.getNome() + "| idade: " +  p.getIdade() + "| peso: " + p.getPeso() + ">.");
		}
	}
	
}
