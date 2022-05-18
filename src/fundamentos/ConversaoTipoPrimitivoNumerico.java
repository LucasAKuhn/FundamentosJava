package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//Conversão implicita
		double a = 1;
		System.out.println(a);
		//Passamos um valor inteiro (1) dentro de um double (
		
		
		
		//Conversão explicita (CAST)
		float b = 1.0F;
		//OU
		float bb = (float) 1.12345678999999;	//Pode gerar perda de valores
		
		
		//Passando um INT para um BYTE (explicita (CAST))
		int c = 120;
		byte d = (byte) c;
		System.out.println(d);
	}
	
}
