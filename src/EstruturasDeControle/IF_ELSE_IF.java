package EstruturasDeControle;

import java.util.Scanner;

public class IF_ELSE_IF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota:");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		} else if(nota >= 7.0 ) {
			System.out.println("Conceito A");
		} else if(nota >= 4 ) {
			System.out.println("Conceito B");
		} else if (nota >= 0) {
			System.out.println("Conceito C");
		}
					
	}
}
