package lambdas;

import java.util.function.Predicate;

import lambdas.desafio.Produto;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 800;
				
		Produto produto = new Produto("Notebook", 3500.00, 0.90);
		System.out.println(isCaro.test(produto));
	}
}
