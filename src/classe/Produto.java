package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	//Construtor simples, sem parametros
	Produto() {
		
	}
	
	//Criando Produto com Construtor
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	//Criando metodo preço com desconto
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}


//Produto p1 = new Produto();
//Classe		Construtor
