package classe.desafio;

public class Pessoa {

	String nomeDaPessoa;
	double pesoDaPessoa;
	
	Pessoa(String nome, double peso) {
		this.nomeDaPessoa = nome;
		this.pesoDaPessoa = peso;	
	}	
	
	void comer(Comida comida) {
		if(comida != null) {
			this.pesoDaPessoa += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá, eu sou o " + nomeDaPessoa + 
				", e tenho " + pesoDaPessoa + " Kgs";
	}
}

