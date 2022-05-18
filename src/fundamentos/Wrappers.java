package fundamentos;

public class Wrappers {	// WRAPPERS são a versao objeto dos tipos primitivos

	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 1000;	//Int
		Long l = 100000L;
		
		Float f = 123.0F;
		
		Double d = 1234.5678;
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';	//char
	}
}
