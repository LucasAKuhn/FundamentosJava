package heranca.teste;

import heranca.desafio.Carro;
import heranca.desafio.Ferrari;
import heranca.desafio.Fiesta;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro Fiesta = new Fiesta();
		Ferrari ferrari = new Ferrari();
		
		System.out.println(Fiesta.velocidade);
		System.out.println(ferrari.velocidade);
		
		Fiesta.acelerar();
		ferrari.acelerar();
		
		// ferrari.ligarTurbo();
		ferrari.acelerar();
		
		System.out.println(Fiesta.velocidade);
		System.out.println(ferrari.velocidade);
		
		Fiesta.frear();
		Fiesta.frear();
		System.out.println(Fiesta.velocidade);
	}
}
