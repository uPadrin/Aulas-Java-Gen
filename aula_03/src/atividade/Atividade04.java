package atividade;

import java.util.Scanner;

public class Atividade04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String p1, p2, p3;

		System.out.println("Digite a primeira palavra: ");
		p1 = sc.nextLine();

		System.out.println("Digite a segunda palavra: ");
		p2 = sc.nextLine();

		System.out.println("Digite a terceira palavra: ");
		p3 = sc.nextLine();

		if (p1.equalsIgnoreCase("vertebrado")) {

			if (p2.equalsIgnoreCase("ave")) {
				
				if(p3.equalsIgnoreCase("carnivoro")) {
					System.out.println("águia");
				}else {
					System.out.println("pomba");
				}
					
			} else {
				if(p3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}else {
					System.out.println("homem");
				}
			}

		} else {

			if (p2.equalsIgnoreCase("inseto")) {
				
				if(p3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}

			} else {
				
				if(p3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				}else {
					System.out.println("sanguessuga");
				}

			}
		}
	}

}