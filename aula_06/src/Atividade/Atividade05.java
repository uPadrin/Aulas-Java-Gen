package Atividade;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade05 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int cod;
		String nome;

		do {
			System.out.print("********************************************\n" + "\n"
					+ "\t1 - Adicionar Clientes na Fila" + "\n\t2 - Listar todos os Clientes"
					+ "\n\t3 - Retirar Cliente da Fila" + "\n\t0 - Sair" + "\n"
					+ "\n********************************************\n" + "Entre com a opção desejada: ");
			cod = sc.nextInt();

			switch (cod) {
			case 1:
				System.out.printf("Digite o nome: ");
				nome = sc.next();
				fila.add(nome);
				System.out.println("Fila: \n\n" + fila + "\n\nCliente Adicionado!");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else
					System.out.println("Lista de Clientes na Fila: " + fila);
				break;
			case 3:
				
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else
					fila.remove();
					System.out.println("Fila: \n\n" + fila + "\n\nCliente Chamado!");
				;
				break;
			}
		} while (cod != 0);
		if (cod == 0)
			System.out.println("Programa Finalizado!");
	}
}
