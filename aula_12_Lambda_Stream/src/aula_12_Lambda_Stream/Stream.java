package aula_12_Lambda_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<String> cidades = Arrays.asList("São Paulo", "Campinas", "São jose dos campos", "Atibaia", "Pereira Barreto", "Mongaguá");
		
		List<String> cidades2 = Arrays.asList("São Paulo", "Campinas", "São jose dos campos", "São Paulo", "Atibaia", "São Paulo", "Pereira Barreto", "Mongaguá");
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> n*n*n)
				.collect(Collectors.toList());
		
		System.out.println(numerosAoCubo);
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		System.out.println(numerosPares);
		
		long cidadesIniciandoP = cidades.stream()
				.filter(c -> c.toString().startsWith("P"))
				.count();
		
		System.out.println(cidadesIniciandoP);
		
		List<String> cidadeSemRepeticoes = cidades2.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(cidadeSemRepeticoes);
	}

}
