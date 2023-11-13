package atividades;

import java.util.Scanner;

public class Atividade04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, ig, pd, back = 0, front = 0, mobile = 0, full = 0, total = 0, somaIdade = 0;
		float media = 0.0f;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {

			System.out.print("Qual sua idade: ");
			idade = sc.nextInt();
			System.out.print("Como se identifica: " + "\n1 – Mulher Cis\n" + "2 – Homem Cis\n" + "3 – Não Binário\n"
					+ "4 – Mulher Trans\n" + "5 – Homem Trans\n" + "6 – Outros\n" + "ID: ");
			ig = sc.nextInt();
			System.out.print("Qual sua area: " + "\n1 – Backend\n" + "2 – Frontend\n" + "3 – Mobile\n"
					+ "4 – FullStack\n" + "ID: ");
			pd = sc.nextInt();
			if (pd == 1)
				back++;
			if ((ig == 1 || ig == 4) && pd == 2)
				front++;
			if ((ig == 2 || ig == 5) && pd == 3 && idade > 40)
				mobile++;
			if (ig == 3 && pd == 4 && idade < 30)
				full++;

			total++;

			somaIdade += idade;

			media = (float) somaIdade / total;

			System.out.println("Deseja continuar (S/N)");
			sc.skip("\\R");
			continua = sc.nextLine().toUpperCase();
		}
		System.out.printf("O número de pessoas desenvolvedoras Backend: %d", back);
		System.out.printf("\nO número de Mulheres Cis e Trans desenvolvedoras Frontend: %d ", front);
		System.out.printf("\nO número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d", mobile);
		System.out.printf("\nO número de Não Binários desenvolvedores FullStack menores de 30 anos: %d", full);
		System.out.printf("\nO número total de pessoas que responderam à pesquisa: %d", total);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", media);
	}
}
