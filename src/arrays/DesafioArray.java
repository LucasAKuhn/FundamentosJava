package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // Recebendo dados digitados no console
		System.out.println("Digite o indice total do Array:");
		int tamArray = entrada.nextInt();
		
		
		double[] notasAluno = new double[tamArray];
		
		System.out.println("Digite a nota do aluno:");	
		
		for(int i = 0; i < notasAluno.length; i++) {
			notasAluno[i] = entrada.nextDouble();			
		}
		
		System.out.println(Arrays.toString(notasAluno));
		
		double total = 0;
	
		for( double nota: notasAluno) {
			total += nota;		
		}
		
		System.out.println("Média é: " + total / tamArray);
		
		entrada.close();
	}
}
