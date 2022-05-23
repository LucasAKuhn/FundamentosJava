package classe;

public class DataWTesteConstructor {

	public static void main(String[] args) {
		
		DataWConstrutor d1 = new DataWConstrutor();
		
		var d2 = new DataWConstrutor(21, 05, 2022);
		
		
		String dataFinal = d1.obterDataFormatada();	//metodo com parametro
		
		String dataFinal2 = d2.obterDataFormatada();	//metodo sem parametro
		
		//System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano + "/");
		
		System.out.println(dataFinal);
		System.out.println(dataFinal2);
	}
}
  