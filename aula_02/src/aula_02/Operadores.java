package aula_02;

import java.util.Scanner;

public class Operadores {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int numero1 = 2, numero2 = 2;
		String valor1 = "2", valor2 = "2";
		int tamanho;
		
		float media = 2.450000f ;
		
		System.out.println("Soma das Variaveis numero1 e numero2 é igual a: " + (numero1 + numero2));
	
		System.out.println("Soma das Variaveis valor1 e valor2 é igual a: " + (valor1) + " e " + (valor2));
	
		System.out.printf("A media final é %.2f", media);
		
		System.out.println("\nQual tamanho: ");
		tamanho = leia.nextInt();
		
		System.out.println("O tamanho era: " + tamanho);
	}

}
