package Exercicio3;

public class TestaConta {
    public static void main(String[] args) {
	Conta minhaconta;
	minhaconta = new Conta();

	minhaconta.setNome("Emiliano");
	minhaconta.setConta("23.352-5");
	minhaconta.deposita(10000);
	minhaconta.getInfo();

	if (minhaconta.saca(1000)) {
	    System.out.println("\nSaque realizado!");
	} else {
	    System.out.println("\nSaque não realizado!");
	}

	minhaconta.getInfo();

	if (minhaconta.saca(10000)) {
	    System.out.println("\nSaque realizado!");
	} else {
	    System.out.println("\nSaque não realizado!");
	}
	minhaconta.getInfo();
    }	

}
