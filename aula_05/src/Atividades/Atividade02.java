package Atividades;

import java.util.Scanner;

public class Atividade02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] num = new int [10];
		int[] num = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		for(int i = 0; i < num.length; i++)
			if (i % 2 != 0 )
				
		System.out.println("Elementos nos índices ímpares:" + (num[i]));
		
	}
	
}
