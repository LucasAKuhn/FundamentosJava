package EstruturasDeControle;

public class While {

	public static void main(String[] args) {
		
		//Recomendado o uso de WHILE quando n�o se sabe o numero
		//de repeti��es que tera que se fazer!
		
	int contador = 1;
	
	while(contador < 10) {
		System.out.println("Parabens pela sua evolu�ao");
		contador += 2;
		System.out.println(contador);
	}
	
	
	}
}
