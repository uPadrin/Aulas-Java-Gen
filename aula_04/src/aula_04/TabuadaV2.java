package aula_04;

import java.util.Scanner;

public class TabuadaV2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n, contador = 1;

		System.out.println("numero");
		n = sc.nextInt();

		while (contador <= 10) {
			System.out.println(n + "x" + contador + " = " + (n * contador));
			contador++;
		}

	}
}