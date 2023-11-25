package aula_11_Optional;

import java.util.Optional;

public class ExeOptional {

	public static void main(String[] args) {

		String[] palavras = new String[10];
		String palavra;

		for (var p : palavras) {
			System.out.println(p);
		}

		Optional<String> checaNull = Optional.ofNullable(palavras[5]);

		if (checaNull.isPresent()) {
			palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else 
			System.out.println("A Palavra é nula");
	}

}
