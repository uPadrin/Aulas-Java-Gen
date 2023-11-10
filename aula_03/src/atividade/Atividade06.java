package atividade;

import java.util.Scanner;

public class Atividade06 {


	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int cod;
		float sal , reaj = 0;
		String nome, cargo;
		
		System.out.printf("Seu nome: ");
		nome = sc.nextLine();
		System.out.printf("Qual código do Cargo: ");
		cod = sc.nextInt();
		System.out.printf("Salário: ");
		sal = sc.nextFloat();
		
		switch(cod) {
		case 1:
			reaj = 0.10f;
			cargo = "Gerente";
			break;
		case 2:
			reaj = 0.7f;
			cargo = "Vendedor";
			break;
		case 3:
			reaj = 0.9f;
			cargo = "Supervisor";
			break;
		case 4:
			reaj = 0.6f;
			cargo = "Motorista";
			break;
		case 5:
			reaj = 0.5f;
			cargo = "Estoquista";
			break;
		case 6:
			reaj = 0.8f;
			cargo = "Técnico de TI";
			break;
		default:
			sal = 0;
			cargo = "Código inexistente";
		}
		sal = sal + (reaj*sal);
		System.out.printf("Nome: %s \nCargo: %s \nSalário %.2f", nome, cargo, sal);
	}
}