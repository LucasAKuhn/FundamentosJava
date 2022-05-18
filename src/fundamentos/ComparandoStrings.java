package fundamentos;

public class ComparandoStrings {

	public static void main(String[] args) {
		System.out.println("2" == "2");	//Resultado true
		
		String s1 = new String("2");
		
		System.out.println("2" == s1);	//Apesar do conteudo ser igual, dara falso
		
		System.out.println("2".equals(s1));	//Agora dara verdadero
		//Ao comparar STRINGS, sempre utilizar o .equals
		
	}
}
