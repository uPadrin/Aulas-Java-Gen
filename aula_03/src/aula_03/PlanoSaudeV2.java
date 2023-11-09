package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int faixaIdade;
		String nome;
		
		System.out.print("Qual seu nome? ");
		nome = sc.nextLine();
		
		System.out.println("\nDigite o número correspondente a sua faixa etária"
				+ "\n1 - De 0 10 anos"
				+ "\n2 - de 11 a 29 anos"
				+ "\n3 - de 30 a 45 anos"
				+ "\n4 - de 46 a 59 anos"
				+ "\n5 - de 60 a 65 anos"
				+ "\n6 - de acima de 65 anos");
		
		System.out.print("\nQual Sua faixa etéria? ");
		faixaIdade = sc.nextInt();
		
		switch(faixaIdade) {
		case 1:
			System.out.printf("%s o seu plano de saude custa plano de suade custara 100,00 por mês." , nome);
			break;
		case 2:
			System.out.printf("%s o seu plano de saude custa plano de suade custara 200,00 por mês." , nome);
			break;
		case 3:
			System.out.printf("%s o seu plano de saude custa plano de suade custara 300,00 por mês." , nome);
			break;
		case 4:
			System.out.printf("%s o seu plano de saude custa plano de suade custara 500,00 por mês." , nome);
			break;
		case 5:
			System.out.printf("%s o seu plano de saude custa plano de suade custara 600,00 por mês." , nome);
			break;
		case 6:
			System.out.printf("%s o seu plano de saude custa plano de suade custara 1000,00 por mês." , nome);
			break;
		default:
			System.out.print("Faixa etaria Invalida");
		}
	}

}
