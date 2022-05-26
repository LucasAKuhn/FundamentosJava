package oo.composicaoDesafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Lucas K");
		
		Compra com1 = new Compra();
		
		Produto p1 = new Produto("Caneta", 5, 2.80 );
		Produto p2 = new Produto("Lapis", 3, 1.60 );
		Produto p3 = new Produto("Caderno", 2, 8.90 );
		
		System.out.println(c1.nome);
	}
}
