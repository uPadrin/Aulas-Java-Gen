package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Bryan", "Vinicius", "Antonio", "Aline", "Samara" };

		float[] notas = new float[5];

		for (int i = 0; i < 6; i++)
			System.out.println("Posição " + i + " = " + pessoas[i]);
		// System.out.println("Posição " + (i + 1) + " = " + pessoas[i]);

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para a possição [ " + i + " ]");
			notas[i] = sc.nextFloat();
		}

		for (int i = 0; i < notas.length; i++)
			System.out.println("Posição " + i + " = " + notas[i]);

		Arrays.sort(pessoas);

		System.out.println("\n");

		for (int i = 0; i < pessoas.length; i++)
			System.out.println("Posição " + i + " = " + pessoas[i]);

		System.out.println("\n");
		for (int i = pessoas.length - 1; i >= 0; i--)
			System.out.println("Posição " + i + " = " + pessoas[i]);

		System.out.println("\n");
		System.out.println("A possição do elemente Luiza: " + Arrays.binarySearch(pessoas, "Luiza"));

		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].equalsIgnoreCase("luiza"))
				System.out.println("\nA Luiza está na posição: " + i);
		}
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
