package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//Adicionando elementos ao Collection  -Não aceita valores primitivos-
		conjunto.add(1.2);	//double -> Double
		conjunto.add(true);	//boolean -> Boolean
		conjunto.add("Teste");	//String
		conjunto.add(1);	//int -> Integer
		conjunto.add('x');	
		
		System.out.println("Tamanho é " + conjunto.size());

		//Collection não aceita valores repetidos
		conjunto.add("Teste");
		System.out.println("Tamanho é " + conjunto.size());
		
		//Removendo algo da collection
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		//Verificando se elemento está dentro de collection
		System.out.println(conjunto.contains(1));
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//Unindo nums e conjunto
		//conjunto.addAll(nums);
		System.out.println(conjunto);

		conjunto.retainAll(nums);	//Somente os valores iguais
		System.out.println(conjunto);
		
		conjunto.clear(); //Limpa o conjunto
		System.out.println(conjunto);
	}
}
