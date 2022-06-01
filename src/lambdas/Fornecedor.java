package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		//Passando uma lista
		Supplier< List<String> > umaLista = () -> Arrays.asList("Ana", "Gui", "Lia");
		
		System.out.println(umaLista.get());
	}
}
