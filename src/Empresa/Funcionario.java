package Empresa;

public abstract class Funcionario {
	private String nome;
	private int cpf;
	private double salario;
	private double bonifica��o;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonifica��o() {
		return bonifica��o;
	}
	public void setBonifica��o(double bonifica��o) {
		this.bonifica��o = bonifica��o;
	}
	
	public abstract double calcBonific();
	
}
