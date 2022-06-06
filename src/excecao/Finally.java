package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		//Utilizamos o FINALLY, para independente do que aconteca, ele entre no bloco
		//e execute o entrada.close()
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finnaly");
			entrada.close();
		}
	}
}
