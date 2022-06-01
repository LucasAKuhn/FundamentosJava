package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";			
				
		System.out.println(parOuImpar.apply(4));		
		
		Function<String, String> oResultadoE =
				valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado =
				valor -> valor + "!!!";
				
		//Utilizando 3 lambds em conjunto
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(33);
		
		System.out.println(resultadoFinal);
		
		
//		Function<Integer, Boolean> verdadeiroOuFalso =
//				numero -> numero > 0 ? true : false ;
//				
//		System.out.println(verdadeiroOuFalso.apply(2));
	}
}
