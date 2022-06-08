package generics;

public class CaixaObjetoTesteSemGenerics {
		
	//EXEMPLO BASICO SEM GENERICS	
	
	public static void main(String[] args) {
		CaixaObjetoSemGenerics caixaA = new CaixaObjetoSemGenerics();
		caixaA.guardar(5.3);
		
		Double coisaA = (Double) caixaA.abrir();	//Fazendo Cast
		System.out.println(coisaA);
		
		
		CaixaObjetoSemGenerics caixaB = new CaixaObjetoSemGenerics();
		caixaB.guardar("Parabens pela sua evolucao");
		
		String coisaB = (String) caixaB.abrir();	//Fazendo Cast
		System.out.println(coisaB);
	}
}
