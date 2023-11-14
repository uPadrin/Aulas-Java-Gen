package aula_06;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");
		pilha.add("Maria");

		System.out.println(pilha);

		pilha.pop();

		System.out.println(pilha);

		System.out.println("O elementado que esta no topo da pilha: " + pilha.peek());

		System.out.println("A Aline est� na pilha? " + pilha.contains("Aline"));
	}

}
