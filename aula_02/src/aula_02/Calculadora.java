package aula_02;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		double X, Y;

		System.out.println("Insira o valor X: ");
		X = leia.nextDouble();
		System.out.println("Insira o valor Y: ");
		Y = leia.nextDouble();

		System.out.println(X + " + " + Y + " = " + (X + Y));
		System.out.println(X + " - " + Y + " = " + (X - Y));
		System.out.println(X + " X " + Y + " = " + (X * Y));
		
		//Se Y for igual a zero
		if(Y>0) {
		System.out.println(X + " / " + Y + " = " + (X / Y) + " \nResto de " + X + " é " + (X % 2) + " \nResto de " + Y
				+ (" é ") + (Y % 2));
		//retorna essa mensagem
		}else {
			System.out.println("Zero não é um numero divisivel");
		}
		if(X<-1) {
			System.out.println("A Raiz quadrada de " + Y + " é " + (Math.sqrt(X)));
			}else {
				System.out.println("Não é possivel achar a raiz quadrada de numeros negativos");
			}
		if(Y<-1) {
		System.out.println("A Raiz quadrada de " + Y + " é " + (Math.sqrt(Y)));
		}else {
			System.out.println("Não é possivel achar a raiz quadrada de numeros negativos");
		}
		System.out.println("Potenciação de " + X + " pelo " + Y + " é " + (Math.pow(X, Y)));
	}

}
