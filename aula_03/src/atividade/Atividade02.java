package atividade;

import java.util.Scanner;

public class Atividade02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Insira um numero");
		num = sc.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.printf("O Número %d é par e positivo!", num);
		} else if (num % 2 == 0 && num < 0 ){
			System.out.printf("O Número %d par e negativo!", num);
		} else if (num % 2 != 0 && num > 0 ){
			System.out.printf("O Número %d impar e positivo!", num);
		} else if (num % 2 != 0 && num < 0 ){
			System.out.printf("O Número %d impar e negativo", num);
		}
	}
}