package Atividades;

import java.util.Scanner;

public class Atividade01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] num = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		// boolean enc = false ; //esse boolean � uma falsa mentirosa
		int aux = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.printf("[%d]", num[i]);
		}
		System.out.print("\nDigite o n�mero que voc� deseja encontrar: ");
		int num2 = sc.nextInt();

		for (int i = 0; i < num.length; i++) {
			if (num2 == num[i]) {
				aux = 1;
				System.out.printf("O numero %d est� localizado na posi��o: %d", num2, i);
			}
		}

		if (aux == 0) {
			System.out.printf("O numero %d n�o foi encontrado!", num2);

		}
		/*
		 * for(int i = 0; i < num.length; i++) { if (num2 == num [i]) { enc = true;
		 * System.out.printf("O numero %d est� localizado na posi��o: %d", num2, i); } }
		 * 
		 * if (!enc) { System.out.printf("O numero %d n�o foi encontrado!", num2);
		 * 
		 * }
		 */

	}
}
