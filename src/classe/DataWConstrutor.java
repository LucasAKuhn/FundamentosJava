package classe;

public class DataWConstrutor {

	int ano;
	int mes;
	int dia;
	
	//Setando valores padrões
	DataWConstrutor() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	
	DataWConstrutor(int diaInicial, int mesInicial, int anoInicial) {
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}
	
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
