package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Lucas Alan K");
		lista.add(u1);
		
		lista.add(new Usuario("Haidi K"));
		lista.add(new Usuario("Paulo K"));
		lista.add(new Usuario("Fabio Alex K"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
			System.out.println(u);	//Graças ao toString
		}
	}
}
