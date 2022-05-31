package heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidade = 0;
	int delta = 5;
	
	protected Carro(int velocidadeMaxima) {	//Está sendo usando dentro da mesma classe
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if(velocidade + delta > VELOCIDADE_MAXIMA ) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade = velocidade + 5;			
		}
	}
	
	public void frear() {
	
		if(velocidade >= 5) {
			velocidade = velocidade - 5;			
		} else {
			velocidade = 0;
		}
	}
}
