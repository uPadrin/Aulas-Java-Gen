package aula_05;

import java.util.Scanner;

public class Matriz {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] matrizDouble = new double[3][3];
		
		// controlar a linha
		for (int i = 0; i < matriz.length; i++) {

			// controlar a linha
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
			}

		
		}
	}
}
