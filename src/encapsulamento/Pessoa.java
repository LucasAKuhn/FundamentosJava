package encapsulamento;

public class Pessoa {

	private int idade;
	
	public Pessoa(int idade) {
		setIdade(idade);
	}
	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);	//Modifica o valor de negativo para positivo
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	
}
