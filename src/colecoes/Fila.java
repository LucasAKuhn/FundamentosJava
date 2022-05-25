package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Parecido com ADD, porém lançam respostas diferentes em caso de erro
		fila.add("Ana");	//retorna false caso der erro
		fila.offer("Bia");		//lança uma exceção
		fila.offer("Pedro");
		fila.offer("João");
		fila.offer("Alencar");
		
		
		//Ambos retornao o primeiro nome da fila sem remover
		System.out.println(fila.peek());	//Retorna false caso lista estiver vazia
		System.out.println(fila.element());	//Lança uma exceção caso a fila estiver vazia
		
		
		//fila.size();
		//fila.clear();
		
		//Retorna o proximo elemento da fila, e o remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
