package Exercicio3;

public class TestaCarro {

    public static void main(String[] args) {
	Carro carro = new Carro();
	carro.setCor("Branco");
	carro.setModelo("hatch cross");
	System.out.println("CARRO\nCor: " + carro.getCor() + " \nModelo: " + carro.getModelo());
	// acelerar sem ligar
	carro.acelerar();

	carro.ligar();
	// acelerar sem passar marcha
	carro.acelerar();

	// passando a primeira
	carro.mudarMarcha(1);
	for (int i = 0; i < 20; i++) {
	    carro.acelerar();
	}
	// passando a segunda
	carro.mudarMarcha(2);
	for (int i = 0; i < 12; i++) {
	    carro.acelerar();
	}
	// passando a terceira
	carro.mudarMarcha(3);
	for (int i = 0; i < 12; i++) {
	    carro.acelerar();
	}
	// passando a quarta
	carro.mudarMarcha(4);
	for (int i = 0; i < 22; i++) {
	    carro.acelerar();
	}
	// passando a quinta
	carro.mudarMarcha(5);
	for (int i = 0; i < 42; i++) {
	    carro.acelerar();
	}
	
	carro.mudarMarcha(6);
	carro.mudarMarcha(0);
	// desacelera
	carro.acelerar();
	// desliga
	carro.ligar();
    }

}
