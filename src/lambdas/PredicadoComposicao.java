package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer>  isPar = num -> num % 2 == 0;
		Predicate<Integer>  isTresDigitos = num -> num >= 100 && num <= 999;
		
		//Juntando os dois metodos
		System.out.println(isPar.and(isTresDigitos).test(22));	//Utilizando &&
		System.out.println(isPar.or(isTresDigitos).test(22));	//Utilizando OU
	}
}
