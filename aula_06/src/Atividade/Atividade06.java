package Atividade;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Atividade06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int cod;
		String nome;

		do {
			System.out.print("********************************************\n" + "\n"
					+ "\t1 - Adicionar Livro na pilha" + "\n\t2 - Listar todos os Livros"
					+ "\n\t3 - Retirar Livro da pilha" + "\n\t0 - Sair" + "\n"
					+ "\n********************************************\n" + "Entre com a opção desejada: ");
			cod = sc.nextInt();

			switch (cod) {
			case 1:
				System.out.printf("Digite o nome do livro: ");
				nome = sc.next();
				pilha.add(nome);
				System.out.println("Pilha: \n\n" + pilha + "\n\nLivro adicionado!");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else
					System.out.println("Lista de Livros na Pilha: " + pilha);
				break;
			case 3:
				
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					pilha.pop();
					System.out.println("Fila: \n\n" + pilha + "\n\nUm Livro foi retirado da pilha!");
				} break;
			}
		} while (cod != 0);
		if (cod == 0)
			System.out.println("Programa Finalizado!");
	}
}
