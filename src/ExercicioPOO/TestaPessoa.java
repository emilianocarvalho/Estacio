/**
 * TestaPessoa
 *
 * @version v 0.1 Agosto/2014
 * @author CARVALHO, Emiliano
 */
package ExercicioPOO;

public class TestaPessoa {

    public static void main(String[] args) {
	Pessoa pessoa = new Pessoa();
	pessoa.setNome("Emiliano");
	pessoa.setIdade(43);
	pessoa.setAltura(1.82);
	
	pessoa.getInfo();
    }

}
