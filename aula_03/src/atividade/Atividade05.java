package atividade;

import java.util.Scanner;

public class Atividade05 {


	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		int cod, quant;
		double valorT, valor;
		String produto;
		
		System.out.printf("Código do produto | Produto | Valor"
				+ "\n1 - Cachorro Quente - R$10,00"
				+ "\n2 - X-Salada - R$15,00"
				+ "\n3 - X-Bacon - R$18,00"
				+ "\n4 - Bauru - R$12,00"
				+ "\n5 - Refrigerante - R$8,00"
				+ "\n6 - Suco de laranja - R$13,00"
				+ "\nQual código do produto: ");
		cod = sc.nextInt();
		
		System.out.print("Qual a quantidade: ");
		quant = sc.nextInt();
	
		switch(cod) {
		case 1:
			valor = 10.00;
			produto = "Cachorro Quente";
			break;
		case 2:
			valor = 15.00;
			produto = "X-Salada";
			break;
		case 3:
			valor = 18.00;
			produto = "X-Bacon";
			break;
		case 4:
			valor = 12.00;
			produto = "Bauru";
			break;
		case 5:
			valor = 8.00;
			produto = "Refrigerante";
			break;
		case 6:
			valor = 13.00;
			produto = "Suco de laranja";
			break;
		default:
			valor = 0;
			produto = "Produto inválido";
		}
		valorT = (quant*valor);
		System.out.printf("Produto: %s \nValor total %.2f",produto, valorT);
	}
}

