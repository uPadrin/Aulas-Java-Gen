package atividades;

import java.util.Scanner;

public class Atividade05 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num, soma = 0;
		// fa�a
		do {
			System.out.print("Digite um n�mero: ");
			num = sc.nextInt();
			// caso
			if (num > 0) {
				soma += num;
			}
			// enquanto
		} while (num != 0);

		System.out.print("A soma dos n�meros positivos �: " + soma);

	}
}
