package aula_04;

import java.util.Scanner;

public class Tabuada {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n;
		System.out.print("numero: ");
		n = sc.nextInt();

		for (int contador = 1; contador <= 10; contador ++) {
			System.out.println(n + "x" + contador + " = " + (n * contador));
		}
	}

}
