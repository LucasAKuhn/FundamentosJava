package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Não ocorre");
		System.out.print(" quebra de linha \n\n");
		
		Scanner entrada = new Scanner(System.in); //Recebendo dados digitados no console
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();	//Valores INTEIROS
		entrada.nextLine();	//Resolvendo BUG do \n (enter)
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();	//Valores TEXTO
		
		System.out.println("\n\nNome = " + nome + " tem " + idade + " anos");
	
	
		entrada.close(); //Fecha scaner (evita uso de memoria e processamento desnecessario)
	}
}
