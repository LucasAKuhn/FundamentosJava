package operadores;

public class DesafiosAritmeticos {

	public static void main(String[] args) {
		
		int a = 3* 4 - 10;
		int b = (int) Math.pow(a, 3);
		
		
		int colchetes = 6 * (3 + 2);
		int sub = (int) Math.pow(colchetes, 2);
		int div = sub / (3 * 2);
		
		int colchetes2 = (1 - 5) * (2 - 7);
		int div2 = colchetes2 / 2;
		int sub2 = (int) Math.pow(div2, 2);
		
		int subt = div - sub2;
		int subtFinal = (int) Math.pow(subt, 3);
		int subFinal = (int) Math.pow(10, 3);
		
		int finalResult = subtFinal / subFinal;
		
		
		System.out.println(finalResult);
	}
}
