package atividades;

import java.util.Scanner;

public class Atividade06 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num = 0, cont = 0;
		float soma = 0.0f, media = 0.0f;
		
		do {
			
			System.out.print("Digite um n�mero: ");
			num = sc.nextInt();
			
			if(num % 3 == 0 && num != 0 ) {
				soma += num;
				cont ++;
			}
			
		}while(num != 0);
		
		media = soma / cont;
		
		System.out.println("A M�dia de todos os n�meros m�ltiplos de 3 �: " + media);
	}

}