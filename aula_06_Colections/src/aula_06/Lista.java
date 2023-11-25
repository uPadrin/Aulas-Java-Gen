package aula_06;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();

		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);

		for (var nota : notas)
			System.out.println(nota);

		System.out.println(notas);
		
		System.out.println("posição do elemento 07: " + notas.indexOf(7.0));
		
		System.out.println("existe do elemento 07: " + notas.contains(7.0));
		
		System.out.println("posição na elemento 00: " + notas.get(0));
		
		notas.remove(3);

		notas.forEach(System.out::println);
		
		System.out.println(notas);
		
		System.out.println("A lista esta vazia? " + notas.isEmpty());
	}

}
