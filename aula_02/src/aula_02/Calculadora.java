package aula_02;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		double X, Y;

		System.out.println("Insira o valor X: ");
		X = leia.nextDouble();
		System.out.println("Insira o valor Y: ");
		Y = leia.nextDouble();

		System.out.println(X + " + " + Y + " = " + (X + Y));
		System.out.println(X + " - " + Y + " = " + (X - Y));
		System.out.println(X + " X " + Y + " = " + (X * Y));
		System.out.println(X + " / " + Y + " = " + (X / Y) + " \nResto de " + X + " é " + (X % 2) + " \nResto de " + Y
				+ (" é ") + (Y % 2));

		System.out.println("A Raiz quadrada de " + Y + " é " + (Math.sqrt(Y)));

		System.out.println("Potenciação de " + X + " pelo " + Y + " é " + (Math.pow(X, Y)));
	}

}
