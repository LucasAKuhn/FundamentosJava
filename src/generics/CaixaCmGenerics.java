package generics;

public class CaixaCmGenerics<T> {

	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa= coisa;	
	}

	public T abrir() {
		return coisa;
	}
}
