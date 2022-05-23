package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		
		Produto p1 = new Produto("Notebook", 5000.00, 0.25);

		//CRIAÇÃO METODO COM CONSTRUTOR
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.00;
		p2.desconto = 0.50;
		
		double precoFinal = p2.precoComDesconto();	//metodo
		
		System.out.println(precoFinal);	//atributo
		System.out.println(p1.nome);	//atributo
	}
}


