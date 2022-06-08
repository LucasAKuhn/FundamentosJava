package generics;

public class CaixaTesteCmGenerics {

	public static void main(String[] args) {
		
		CaixaCmGenerics<String> caixaA = new CaixaCmGenerics<>();
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		
		CaixaCmGenerics<Double> caixaB = new CaixaCmGenerics<>();
		caixaB.guardar(03.02);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
