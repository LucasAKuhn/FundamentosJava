package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		var d1 = new Data();
		d1.ano = 1996;
		d1.mes = 02;
		d1.dia = 03;
		
		String dataFinal = d1.obterDataFormatada(25, 03, 1998);	//metodo com parametro
		
		String dataFinal2 = d1.obterDataFormatada();	//metodo sem parametro
		
		//System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano + "/");
		
		System.out.println(dataFinal);
		System.out.println(dataFinal2);
	}
}
  