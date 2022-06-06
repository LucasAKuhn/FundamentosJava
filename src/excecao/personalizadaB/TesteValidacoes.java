package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		//tratando dois erros ao mesmo tempo
		try {
			Aluno aluno = new Aluno("saaa", -7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException  e) {
			System.out.println(e.getMessage());
			//Tratando dois erros no mesmo catch
		} catch (NumeroForaDoIntervaloException 
		| IllegalArgumentException  e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}
