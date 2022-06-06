package excecao;

public class Causa {

	public static void main(String[] args) {
		
		//Aluno aluno1 = new Aluno("Lucas", 7.0);
		
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		metodoB(aluno);
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está NULOOO");
		}
		
		System.out.println(aluno.nome);
	}
}
