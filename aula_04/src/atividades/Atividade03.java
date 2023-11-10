package atividades;

import java.util.Scanner;

public class Atividade03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade = 0, contador21 = 0 , contador50 = 0;
	
		
		while (idade > -1 ) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			if(idade<21 && idade>0)
				contador21 ++;
			if(idade>50)
				contador50 ++;
		}
		System.out.printf("Total de pessoas menores de 21 anos: %d" , contador21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d" , contador50);
	}

}
