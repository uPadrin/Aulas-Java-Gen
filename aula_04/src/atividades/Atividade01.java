package atividades;

import java.util.Scanner;

public class Atividade01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n1, n2;

		System.out.printf("Digite o primeiro n�mero do intervalo:");
		n1 = sc.nextInt();

		System.out.printf("Digite o segundo n�mero do intervalo:");
		n2 = sc.nextInt();

		if (n1 < n2) {
			System.out.printf("No Intervalo entre %d e %d:\n",n1 , n2 );
			for (int i = n1; i <= n2; i ++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d � m�ltiplo de 3 e 5 \n", i);
				}
				
			}
		} else {
			System.out.printf("O primeiro n�mero deve ser menor do que o segundo n�mero");
		}
	}
}
