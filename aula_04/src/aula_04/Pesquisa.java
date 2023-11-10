package aula_04;

import java.util.Scanner;

public class Pesquisa {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte, fut = 0, vol = 0, bask = 0, outros = 0;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Qual sua idade: ");
			idade = sc.nextInt();
			do {
				System.out.println("Qual seu esporte favorito: ");
				esporte = sc.nextInt();

				if (esporte < 1 || esporte > 4)
					System.out.println("DIGITE UM VALOR DE 1 E 4: ");
			// enquanto	
			} while (esporte < 1 || esporte > 4);
			

			if (esporte == 1)
				fut++;
			if (esporte == 2 && idade >= 18)
				vol++;
			if (esporte == 3 && idade <= 18)
				bask++;
			if (esporte == 4)
				outros++;

			System.out.println("Deseja continuar (S/N)");
			sc.skip("\\R");
			continua = sc.nextLine().toUpperCase();
		}
		System.out.println("Total de pessoas que gostam de futebol:" + fut);
		System.out.println("Total de pessoas que gostam de voleibol e são maiores 18 anos: " + vol);
		System.out.println("Total de pessoas que gostam de basquete e são menores de 18 anos: " + bask);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);
	}
}
