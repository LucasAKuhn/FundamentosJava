package generics;

//Neste exemplo só poderei utilkizar algum do tipo Number, pois foi definido na classe
public class CaixaTesteCmRestricao {

	public static void main(String[] args) {
		
	
	CaixaCmRestricao<Double> caixaA = new CaixaCmRestricao<>();
	caixaA.guardar(2.3);
	System.out.println(caixaA.abrir());
	
	}
}
