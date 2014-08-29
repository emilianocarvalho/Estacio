/**
 * Pessoa
 *
 * @version v 0.1 Agosto/2014
 * @author CARVALHO, Emiliano
 */
package ExercicioPOO;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected double altura;
    
    public String getNome(String nome) {
	return this.nome;
    }
    
    public void setNome(String nome) {
	this.nome = nome;
    }
        
    public void setIdade(int idade) {
	this.idade = idade;
    }
       
    public void setAltura(double altura) {
	this.altura = altura;
    }
    
    public void getInfo() {
	System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }    
}