package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10.0);
		System.out.println(a1.area());
	
		
		AreaCirc a2 = new AreaCirc(5.0);
		//a2.pi = 25;	//Alterando valor de PI
		System.out.println(a2.area());
	}
}
