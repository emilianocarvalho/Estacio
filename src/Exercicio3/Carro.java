package Exercicio3;

public class Carro {
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private boolean ligado;
    private int marcha;

    public Carro(){
	ligado = false;
	marcha = 0; 
	velocidadeAtual = 0;
	setVelocidadeMaxima(300);
    }

    public void ligar() {
	if (this.ligado) {
	    this.ligado = false;
	    System.out.println("Carro Desligado!");
	} else {
	    this.ligado = true;
	    System.out.println("Carro Ligado! Vruuuum!");
	}
    }

    public void acelerar(){
	if (this.ligado) {
	    switch (marcha) {
	    case 0:		
		System.out.println("Carro em ponto morto, desacelerado!");
		velocidadeAtual = 0;
		break;

	    case 1:		
		System.out.println("1a marcha " + velocidadeAtual + " Km/h");
		if (velocidadeAtual <= 20) {
		    velocidadeAtual++;
		} else { 
		    System.out.println("Mude de marcha!!!"); 
		}
		break;
	    case 2:		
		System.out.println("2a marcha " + velocidadeAtual + " Km/h");
		if (velocidadeAtual <= 30) {
		    velocidadeAtual++;
		} else { 
		    System.out.println("Mude de marcha!!!"); 
		}
		break;
	    case 3:		
		System.out.println("3a marcha " + velocidadeAtual + " Km/h");
		if (velocidadeAtual <= 40) {
		    velocidadeAtual++;
		} else { 
		    System.out.println("Mude de marcha!!!"); 
		}
		break;
	    case 4:		
		System.out.println("4a marcha " + velocidadeAtual + " Km/h");
		if (velocidadeAtual <= 60) {
		    velocidadeAtual++;
		} else { 
		    System.out.println("Mude de marcha!!!"); 
		}
		break;
	    case 5:		
		System.out.println("5a marcha " + velocidadeAtual + " Km/h");
		if (velocidadeAtual <= 100) {
		    velocidadeAtual++;
		} else { 
		    System.out.println("limite de velocidade atingido!!!"); 
		}
		break;
	    }
	} else {
	    System.out.println("Ligue o carro!");
	}
    }
    public void mudarMarcha(int marcha) {
	if (marcha <= 5) {
	    this.marcha = marcha;
	    System.out.println(marcha + " marcha");
	    
	    if ((marcha == 0) && (velocidadeAtual > 0)){
		System.out.println("Desacelere! Você esta em ponto morto!");
	    }
	} else {
	    System.out.println(marcha + " marcha - Carro com 5 marchas!");
	}
    }

    public String getCor() {
	return cor;
    }

    public void setCor(String cor) {
	this.cor = cor;
    }

    public String getModelo() {
	return modelo;
    }

    public void setModelo(String modelo) {
	this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
	return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
	this.velocidadeMaxima = velocidadeMaxima;
    }
}
