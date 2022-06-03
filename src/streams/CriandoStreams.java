package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		// Criando um Consumer para imprimir
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		//Primeira forma de imprimir
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		//Segunda
		Stream.of(maisLangs).forEach(print);
		
		//Terceira
		Arrays.stream(maisLangs).forEach(print);
		//Quarta (desta vez escolhendo os dados)
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		//String infinita
		//Stream.iterate(0,  n -> n + 1).forEach(println);
	}
}
