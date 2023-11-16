package Atividades;

public class Atividade03 {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int x =0 , y = 0 ;
		System.out.printf("Elementos da Diagonal Principal: "); 
		for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][i] +  " ");
				x += matriz[i][i];
		}
		System.out.printf("\nElementos da Diagonal Secundária: ");
		for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
            y += matriz[i][matriz.length - 1 - i];
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + x);
		
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + y);
		
	}
	}

