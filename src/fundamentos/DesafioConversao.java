package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // Recebendo dados digitados no console
		System.out.println("Digite seus três ultimos salários:");
		
		String salary1 = entrada.nextLine().replace(",", "."); // Passando valores para STRING
		String salary2 = entrada.nextLine(); // 
		String salary3 = entrada.nextLine(); // 
		
		System.out.println(salary1);
		
		salary1 = salary1.replace(",", ".");
		salary2 = salary2.replace(",", ".");	//Substituindo , por .
		salary3 = salary3.replace(",", ".");
		
		double salario1 = Double.parseDouble(salary1);
		double salario2 = Double.parseDouble(salary2);	//Convertendo String para double
		double salario3 = Double.parseDouble(salary3);
		
		System.out.println((salario1 + salario2 + salario3) / 3);	//Imprimindo na tela
	
		
		entrada.close();
	}
	
}
