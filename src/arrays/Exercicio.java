package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		//Criando um array
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 5.2;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}	
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		//Iniciando Arrays com dados
		double totalAlunoB = 0;
		double[] notasAlunoB = { 7.0, 9.0, 5.5, 8 };
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}	
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
