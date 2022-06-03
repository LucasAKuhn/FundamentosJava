package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
			
			Aluno a1 = new Aluno("Ana", 5.8);
			Aluno a2 = new Aluno("Luna", 6.1);
			Aluno a3 = new Aluno("Gui", 10);
			Aluno a4 = new Aluno("Gabi", 9.8);
			Aluno a5 = new Aluno("Ana", 5.8);
			Aluno a6 = new Aluno("Luna", 6.1);
			Aluno a7 = new Aluno("Gui", 10);
			Aluno a8 = new Aluno("Gabi", 9.8);
			
			List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
			
			System.out.println("Distintos..");
			alunos.stream().distinct().forEach(System.out::println);
			
	}
}
