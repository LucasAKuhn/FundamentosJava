package EstruturasDeControle;

public class While {

	public static void main(String[] args) {
		
		//Recomendado o uso de WHILE quando não se sabe o numero
		//de repetições que tera que se fazer!
		
	int contador = 1;
	
	while(contador < 10) {
		System.out.println("Parabens pela sua evoluçao");
		contador += 2;
		System.out.println(contador);
	}
	
	
	}
}
