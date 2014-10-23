package Collections;

/* Criar uma coleção de animais e que seja realizada pesquisa
 * por código exibindo o animal correto
 */
public class Animal {
	private String nome;
	private double peso;
	private int codigo;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void pesquisaAnimal(String nome) {
		System.out.println();
	}
}
