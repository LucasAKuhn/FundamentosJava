package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		System.out.println("Digite algum dia da semana:");
		
		Scanner teclado = new Scanner(System.in);
		String diaDaSemana = teclado.nextLine();
		
		if(diaDaSemana.equals("Domingo")) {
			System.out.println("1");
		}else if (diaDaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		}else if (diaDaSemana.equalsIgnoreCase("Terça")) {
			System.out.println("3");
		}else if (diaDaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		}else if (diaDaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}else if (diaDaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		}else if (diaDaSemana.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
		}else {
			System.out.println("String inválida");
		}
	}
}
