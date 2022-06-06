package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) 
		throws StringVaziaException, NumeroForaDoIntervaloException {
		//Fazendo a verifica��o se o objeto aluno est� nulo ou n�o
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno est� nulo!");
		}
		//Fazendo a verifica��o se foi passado algum nome (trim � para nao contabilizar espa�o)
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException();
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaDoIntervaloException();
		}
	}
}
