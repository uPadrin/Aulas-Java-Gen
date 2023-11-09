package atividade;

import java.util.Scanner;

public class Atividade01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numA, numB, numC;

		System.out.print("Digite o numero A: ");
		numA = sc.nextInt();

		System.out.print("Digite o numero B: ");
		numB = sc.nextInt();

		System.out.print("Digite o numero C: ");
		numC = sc.nextInt();

		if (numA + numB > numC) {
			System.out.printf("A Soma de %d + %d é Maior do que %d", numA, numB, numC);
		} else if (numA + numB < numC) {
			System.out.printf("A Soma de %d + %d é Menor do que %d", numA, numB, numC);
		} else if (numA + numB == numC) {
			System.out.printf("A Soma de %d + %d é Igual do que %d", numA, numB, numC);
		}
	}

}
