package atividades;

import java.util.Scanner;

public class Atividade06 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num, cont = 0;
		float media = 0.0f, soma = 0;
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			if (num % 3 == 0 && num != 0 ) {
				soma += num ;
				cont ++ ;
				
			}
			
		} while (num != 0);
		media = soma / cont;
		System.out.print("A média de todos os números múltiplos de 3 é: " + media);

	}
}
