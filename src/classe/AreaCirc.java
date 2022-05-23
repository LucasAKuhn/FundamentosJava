package classe;

public class AreaCirc {

	double raio;
	final static double pi = 3.14;	//Valor de PI associado a classe, e não a instancia (static)
	//final = valor do PI inalteravel
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}
}
