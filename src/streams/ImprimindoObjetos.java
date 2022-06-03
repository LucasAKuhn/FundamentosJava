package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		 List<String> aprovados = Arrays.asList("Gui", "Lucas", "Ana");
		 
		 System.out.println("Usando o foreach...");
		 for(String nomes: aprovados) {
			 System.out.println(nomes);
		 }
		 
		 System.out.println("\n Usando Iterator...");
		 Iterator<String> it = aprovados.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 
		 System.out.println("\n Usando Stream");
		 Stream<String> stream = aprovados.stream();
		 stream.forEach(System.out::println); 
	}
}
