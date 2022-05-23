package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor simples, sem parametros
	Produto() {
		
	}
	
	//Criando Produto com Construtor
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Criando metodo preço com desconto
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}


//Produto p1 = new Produto();
//Classe		Construtor
