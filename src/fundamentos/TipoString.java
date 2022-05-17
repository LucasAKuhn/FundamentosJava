package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		String s = "Boa tarde";
		
		//Concatenando
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!");
		
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		
		var nome = "Lucas";
		var sobrenome = "Kuhn";
		var profissao = "Programador";
		var salario = 7.00000;
		
		System.out.printf("O senhor %s %s trabalha como "
				+ "%s e recebe cerca de %.3f ao mes!!", nome, sobrenome, profissao, salario);
		
	}

}
