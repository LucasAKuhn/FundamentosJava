package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		 double a = 2;
		 double b = a;	//atribui�ao por valor (Tipo primitivo)
		 
		 a++;
		 b--;
		 
		 System.out.println("A = " + a);
		 System.out.println("B = " + b);
		 
		 
		 
		 Data d1 = new Data();
		 Data d2 = d1;	//Atribui��o por referencia (Objeto)
		 
		 d1.dia = 31;
		 d2.mes = 12;
		 
		 System.out.println(d1.obterDataFormatada());
		 System.out.println(d2.obterDataFormatada());
	}
}
