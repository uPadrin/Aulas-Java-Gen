package aula_02;

import java.util.Scanner;

public class Exer02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float n1, n2, n3, n4;

		System.out.println("Insira a Nota1: ");
		n1 = leia.nextFloat();

		System.out.println("Insira a Nota2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira a Nota3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira a Nota4: ");
		n4 = leia.nextFloat();
		
		System.out.println("O valor é do Média final " + (n1+n2+n3+n4/4));
	}
}
