package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		
		Produto p1 = new Produto("Notebook", 5000);

		//CRIAÇÃO METODO COM CONSTRUTOR
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 20.00;
		
		Produto.desconto = 0.50;	//Setando valores de desconto para todos os produtos
		
		double precoFinal = p1.precoComDesconto();	//metodo
		double precoFinal2 = p2.precoComDesconto();	//metodo
		
		System.out.println(precoFinal);	//atributo
		System.out.println(precoFinal2);	//atributo
	}
}


