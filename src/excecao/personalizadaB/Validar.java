package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) 
		throws StringVaziaException, NumeroForaDoIntervaloException {
		//Fazendo a verificação se o objeto aluno está nulo ou não
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		//Fazendo a verificação se foi passado algum nome (trim é para nao contabilizar espaço)
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException();
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaDoIntervaloException();
		}
	}
}
