package aula_03;

import java.util.Scanner;

public class PlanoSaude {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		String nome;
		
		System.out.print("Qual seu nome? ");
		nome = sc.nextLine();
		
		System.out.print("\nQual sua idade? ");
		idade = sc.nextInt();
		
		if(idade > 0 && idade <= 10) {
			System.out.printf("%s o seu plano de saude custa plano de suade custara 100,00 por mês." , nome);
		}else if(idade >= 11 && idade <= 29) {
			System.out.printf("%s o seu plano de saude custa plano de suade custara 200,00 por mês." , nome);
		}else if(idade >= 30 && idade <= 45) {
			System.out.printf("%s o seu plano de saude custa plano de suade custara 300,00 por mês." , nome);
		}else if(idade >= 46 && idade <= 59) {
			System.out.printf("%s o seu plano de saude custa plano de suade custara 500,00 por mês." , nome);
		}else if(idade >= 60 && idade <= 65) {
			System.out.printf("%s o seu plano de saude custa plano de suade custara 600,00 por mês." , nome);
		}else if(idade > 65)  {
			System.out.printf("%s o seu plano de saude custa plano de suade custara 1000,00 por mês." , nome);
		}else {
			System.out.printf("%d não é uma idade valida!" , idade);
		}
	}

}
