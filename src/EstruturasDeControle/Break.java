package EstruturasDeControle;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				break;	//Quando i for igual a 5, ele encerrara o la�o
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}
}
