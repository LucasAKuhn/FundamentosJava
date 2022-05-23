package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4;	//Utilizando o static também consigo acessar
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();	//Tivemos que criar uma instancia para acessar
		//o valor fora do class
		
		System.out.println(p.a);
		
		System.out.println(b);
		
	}
}
