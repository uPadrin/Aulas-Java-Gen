package atividades;

import java.util.Scanner;

public class Atividade02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n1, imp = 0, par = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d� n�mero: ", i);
			n1 = sc.nextInt();
			if (n1 % 2 == 0) {
				par++;
			} else {
				imp++;
			}
		}
		System.out.printf("\nTotal de n�meros pares: %d" , par);
		System.out.printf("\nTotal de n�meros �mpares:%d" , imp);
	}

}
