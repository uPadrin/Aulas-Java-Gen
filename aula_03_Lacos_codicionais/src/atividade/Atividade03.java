package atividade;

import java.util.Scanner;

public class Atividade03 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade;
		String nome;
		boolean ps;
		
		System.out.println("Qual seu nome? ");
		nome = sc.nextLine();
		System.out.println("Qual sua idade? ");
		idade = sc.nextInt();
		System.out.println("� sua primeira Doa��o?(true or false)");
		ps = sc.nextBoolean();
		
		if (idade >= 60 && idade <=68 && ps == true) {
			System.out.printf("%s est� apto para doar sangue!", nome);
		} else if (idade >= 18 && idade <=69) {
			System.out.printf("%s est� apto para doar sangue!", nome);
		}else {
			System.out.printf("%s n�o est� apto para doar sangue!", nome);
		}
		

	}

}
