 package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		//Constitui de dois dados: Chave e valor
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1,  "Roberto");
		usuarios.put(2,  "Rafael");//put é responsavel tanto por add, qnto por modificar valor
		usuarios.put(3,  "Rocke");
		usuarios.put(4,  "Robson");
		usuarios.put(5,  "Ramiro");
		usuarios.put(6,  "Richard");
		
		System.out.println(usuarios.keySet());	//Imprime as chaves
		System.out.println(usuarios.values());	//Imprime os valores
		
		System.out.println(usuarios.entrySet()); //Imprime chave e valor
		
		
		for(int chave: usuarios.keySet()) {	//Percorrendo as CHAVES
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {	//Percorrendo as CHAVES
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {	//Percorrendo os dois valores ao mesmo tempo
			System.out.println(registro);
		}
		
	}
}
