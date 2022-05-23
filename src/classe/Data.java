package classe;

public class Data {

	int ano;
	int mes;
	int dia;
	
	
	//metodo criado por mim
	String obterDataFormatada(int dia, int mes, int ano) {
		return dia + "/" + mes + "/" + ano;
	}
	
	//metodo criado pelo professor
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	//Vimos que é possivel ter dois metodos com o mesmo nome, desde que os parametros passados 
	//sejam diferentes;
}
