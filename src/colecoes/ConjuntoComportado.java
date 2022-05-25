package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();	//Lista nao ordenada
		TreeSet<String> lista = new TreeSet<String>();		//Lista ordenada
		lista.add("Add1");
		lista.add("Add2");
		lista.add("Add3");
		lista.add("Add4");
		
		for(String listar: lista) {
			System.out.println(listar);
		}
	}
}
