package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Parecido com ADD, por�m lan�am respostas diferentes em caso de erro
		fila.add("Ana");	//retorna false caso der erro
		fila.offer("Bia");		//lan�a uma exce��o
		fila.offer("Pedro");
		fila.offer("Jo�o");
		fila.offer("Alencar");
		
		
		//Ambos retornao o primeiro nome da fila sem remover
		System.out.println(fila.peek());	//Retorna false caso lista estiver vazia
		System.out.println(fila.element());	//Lan�a uma exce��o caso a fila estiver vazia
		
		
		//fila.size();
		//fila.clear();
		
		//Retorna o proximo elemento da fila, e o remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
