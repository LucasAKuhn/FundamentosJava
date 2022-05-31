package encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(45);
		p1.setIdade(-100);	//Altera idade com metodo
		
		System.err.println(p1.getIdade());	//Ler idade com metodo
	}
}
