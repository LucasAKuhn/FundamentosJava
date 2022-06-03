package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Futebol {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador("Jhonatan", 3, true);
		Jogador j2 = new Jogador("Rafinha", 6, true);
		Jogador j3 = new Jogador("Henrique", 4, true);
		Jogador j4 = new Jogador("Francisco", 7, false);
		Jogador j5 = new Jogador("Nego Dah", 6, false);
		Jogador j6 = new Jogador("Pezao", 8, true);
		Jogador j7 = new Jogador("Rodrigo", 8, true);
		
		
		List<Jogador> jogadores = Arrays.asList(j1, j2, j3, j4, j5, j6, j7);

		Predicate<Jogador> bomJogador = j -> j.nivel >= 6;
		Predicate<Jogador> pagaEmDia = j -> j.pagamento;
		Function<Jogador, String> saudacaoJogador =
				a -> "O jogador " + a.nome + " joga bem e paga certo";
		
		jogadores.stream()
			.filter(bomJogador)
			.filter(pagaEmDia)
			.map(saudacaoJogador)
			.forEach(System.out::println);
		
		
	}
}
