package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();	
		//Conceito de pilha: Primeiro a entrar, ultimo a sair
		
		livros.add("O pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		
		System.out.println(livros.peek());
		
		//Retorna o proximo elemento da fila, e o remove
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		
	}
}
