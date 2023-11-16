package Atividade;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HashSet<Integer> num = new HashSet<Integer>();
		
		for(int i = 0; i <= 9; i ++) {
			System.out.println("Insira " + (i+1) +" numero");
			num.add(sc.nextInt());
			}

		Iterator<Integer> iNum = num.iterator();

		System.out.println("Listar dados do Set:");
		while (iNum.hasNext())
			System.out.println(+ iNum.next());
	}

}
