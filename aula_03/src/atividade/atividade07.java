package atividade;

import java.util.Scanner;

import javax.swing.text.DefaultCaret;

public class atividade07 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		float num1, num2, res;
		int op;
		String opS;
		
		System.out.print("Digite o 1º número: ");
		num1 = sc.nextFloat();
		System.out.print("Qual operação: ");
		op = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		num2 = sc.nextFloat();
			
		switch(op) {
		case 1:
			res = (num1 + num2);
		System.out.printf("%.2f + %.2f = %.2f " , num1 , num2, res );
		break;
		case 2:
			res = (num1 - num2);
		System.out.printf("%.2f - %.2f = %.2f " , num1 , num2, res );
		break;
		case 3:
			res = (num1 * num2);
		System.out.printf("%.2f * %.2f = %.2f " , num1 , num2, res );
		break;
		case 4:
			res = (num1 / num2);
		System.out.printf("%.2f / %.2f = %.2f " , num1 , num2, res );
		break;
		default:
			System.out.println("Operação Inválida!");
		}
	}

}
