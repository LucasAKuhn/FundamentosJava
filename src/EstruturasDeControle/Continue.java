package EstruturasDeControle;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++ ) {
			if(i % 2 == 1) {	//Diferen�a da divisao de i / 2
				continue;	//Pula este la�o, e segue posteriormente
			}
		}
	}
}
