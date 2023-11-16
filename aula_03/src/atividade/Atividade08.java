package atividade;

import java.util.Scanner;

public class Atividade08 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cod, num;
		float saldo = 1000.00f;
		
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.print("Codigo da Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:	
		System.out.printf("Operação - Saldo\n\nSaldo: " + saldo );
		break;
		case 2:
			System.out.println("Valor:");
			num = sc.nextInt();
			if (num > saldo) {
				System.out.println("Operação Inválida!");
			}else {
			saldo = (saldo - num);
		System.out.printf("Operação - Saque\n\nNovo Saldo: " + saldo );
			}break;
		case 3:
			System.out.println("Valor:");
			num = sc.nextInt();
			saldo = (saldo + num);
		System.out.printf("Operação - Deposito\n\nNovo Saldo: " , saldo );
		break;
		default:
			System.out.println("Codigo invalido");	}
	}
}
