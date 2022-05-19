package operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Recebendo dados digitados no console
		System.out.println("Digite os valores e a operação:");
		
		double num1 = entrada.nextDouble(); // Passando valores para STRING
		double num2  = entrada.nextDouble(); // Passando valores para STRING		  

		String  enter = entrada.nextLine();  	//Burlar erro do ENTER
		String  operacao = entrada.nextLine();  

		Double result = (operacao.equals("+")) ? num1 + num2 : 
			(operacao.equals("-")) ? num1 - num2 : 
					(operacao.equals("/")) ? num1 / num2 :
						 num1 * num2;

		System.out.println(result);
				
		entrada.close();
	}
}

