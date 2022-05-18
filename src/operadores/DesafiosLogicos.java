package operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = !true;
		boolean trabalho2 = !true;
		
		if (trabalho1 == true && trabalho2 == true ) {
			System.out.println("Foi comprada a TV de 52 polegadas, e teve sorvete");
		} else if (trabalho1 == true && trabalho2 == false ) {
			System.out.println("Foi comprada a TV de 32 polegadas, e teve sorvete 1");
		} else if (trabalho1 == false && trabalho2 == true ) {
			System.out.println("Foi comprada a TV de 32 polegadas, e teve sorvete 2");
		} else {
			System.out.println("Nenhuma TV foi comprada. Não teve sorvete");
		}
	}
}

