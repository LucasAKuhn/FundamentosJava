package EstruturasDeControle;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		int nota = 1;
		String conceito = "";
		
		switch(nota) {
		case 10: case 9: case 8: case 7:
			conceito = "A";
			break;
		case 6: case 5: case 4:
			conceito = "B";
			break;
		case 3: case 2: case 1: case 0:
			conceito = "C";
			break;
		default:
			conceito = "Nota invalida";				
		}
		
		System.out.println(conceito);
	}
}
