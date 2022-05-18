package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");	//Abrindo 
		//caixa na tela para peguntar ao usuario um valor
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);	//Convertendo string para double
		double numero2 = Double.parseDouble(valor2);	//Convertendo string para double
		
		double soma = numero1 + numero2;
		System.out.println(soma);
	}
}

