package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(9.3).adicionar(6.7);
		Media m2 = new Media().adicionar(10).adicionar(5.0);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
	}
}
