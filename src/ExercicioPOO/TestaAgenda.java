package ExercicioPOO;

public class TestaAgenda {

    public static void main(String[] args) {
	Agenda agenda = new Agenda(2);
	Pessoa p1 = new Pessoa();
	p1.setNome("Emiliano");
	p1.setIdade(43);
	p1.setAltura(1.82);
	
	Pessoa p2 = new Pessoa();
	p2.setNome("Milao");
	p2.setIdade(34);
	p2.setAltura(1.82);

	agenda.armazenaPessoa(p1.nome, p1.idade, p1.altura);
	agenda.armazenaPessoa(p2.nome, p2.idade, p2.altura);
	
	agenda.imprimePessoa(1);
	agenda.imprimeAgenda();
    }

}
