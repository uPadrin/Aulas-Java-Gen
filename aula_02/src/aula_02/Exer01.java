package aula_02;

import java.util.Scanner;

public class Exer01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float salario, abono;
		
		System.out.println("Insira o Sal�rio: ");
		salario = leia.nextFloat();
		System.out.println("Insira o Abono: ");
		abono = leia.nextFloat();

		System.out.println("O valor � do salario final " + (salario+abono));
	}

}
