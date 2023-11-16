package Atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01 {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i <= 4; i ++) {
		System.out.println("Insira " + (i+1) + " cores:");
		cores.add(sc.nextLine());
		}
		
		System.out.println("Listar todas as cores: " + cores);
		cores.sort(null);
		System.out.println("Ordenar as cores: " + cores);
		
	}

}
