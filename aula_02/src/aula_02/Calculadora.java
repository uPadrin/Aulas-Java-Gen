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
		System.out.println(X + " / " + Y + " = " + (X / Y) + " \nResto de " + X + " � " + (X % 2) + " \nResto de " + Y
				+ (" � ") + (Y % 2));

		System.out.println("A Raiz quadrada de " + Y + " � " + (Math.sqrt(Y)));

		System.out.println("Potencia��o de " + X + " pelo " + Y + " � " + (Math.pow(X, Y)));
	}

}
