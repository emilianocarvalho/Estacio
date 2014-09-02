/**
 * Agenda
 *
 * @version v 0.1 Agosto/2014
 * @author CARVALHO, Emiliano
 */
package ExercicioPOO;

public class Agenda {
    protected Pessoa[] pessoa;
    int tam;

    public Agenda() {
	tam = 0;
    }

    public Agenda(int qtd) {
	pessoa = new Pessoa[qtd];
	System.out.println("Pessoa criada tamanho: " + tam);
    }

    /* armazena a pessoa na agenda */
    public void armazenaPessoa(String nome, int idade, double altura) {
	pessoa[tam] = new Pessoa();

	pessoa[tam].setNome(nome);
	pessoa[tam].setIdade(idade);
	pessoa[tam].setAltura(altura);
	tam++;
    }

    /* remove a pessoa */
    public void removePessoa(String nome) {
	for (Pessoa p : pessoa) {	    
	    if (p.nome == nome) {
		p.setNome("");
		p.setIdade(0);
		p.setAltura(0);		
	    }
	}
    }
    /* informa em que posição da agenda está a pessoa */
    public int buscaPessoa(String nome) {
	int i = 0;
	int r = 0;
	for (Pessoa p : pessoa) {
	    if (p.nome == nome) {
		r = i;
	    } 
	    i++;
	}
	return r;
    }
    /* imprime os dados de todas as pessoas da agenda */
    public void imprimeAgenda() {
	System.out.println("\nAGENDA ||||||||||||||||||||");
	for (Pessoa p : pessoa) {
	    System.out.println("\nNome: " + p.nome + "\nIdade: " + p.idade + "\nAltura: " + p.altura);
	}
    }
    /* imprime os dados da pessoa que está na posição “i” da agenda. */
    public void imprimePessoa(int index){
	System.out.println("\nIMPRIME PESSOA ||||||||||||");
	if (index < pessoa.length) {
	    System.out.println("\nNome: " + pessoa[index].nome + "\nIdade: "
		    + pessoa[index].idade + "\nAltura: " + pessoa[index].altura);
	} else {
	    System.out.println("índice não encontrado!");
	}
    }
}
