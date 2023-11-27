package aula_12_Lambda_Stream;


import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("Exibir dados da lista: ");
		// for (var n : numeros)
		//	System.out.println(n);
		
		numeros.forEach(n -> System.out.print(n + " "));
		System.out.println("\nExibir todos os elementos da lista em dobro");

		// for (var n : numeros)
		//	System.out.println(n + n);
		
		numeros.forEach(n -> System.out.print(n+n + " "));
		
		System.out.println("\nExibir todos os elementos pares da lista ");

		// for (var n : numeros)
		//	if(n%2 == 0)
		//	System.out.println(n);
		
		// numeros.forEach(n -> {
		//	if(n%2 == 0)
		//		System.out.print(n + " ");
		//   });
		
		// if ternário
		numeros.forEach(n -> System.out.println((n % 2 == 0) ? n : ""));
		
	}

}
