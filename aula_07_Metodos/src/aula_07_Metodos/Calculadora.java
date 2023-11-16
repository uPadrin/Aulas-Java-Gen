package aula_07_Metodos;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, op = 0;

		while (true) {
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			System.out.print("Qual operação Matamática vece deseja realizar: ");
			op = sc.nextInt();
			if (op == 0) {
				System.exit(0);
			}else{
				System.out.println("Digite o primeiro numero: ");
				num1 = sc.nextInt();

				System.out.println("Digite o segundo numero: ");
				num2 = sc.nextInt();

				switch (op) {
				case 1 -> System.out.println("Soma: " + somar(num1, num2));

				}
			}
		}
	}

	static int somar(int num1, int num2) {
		return num1 + num2;
	}

}
