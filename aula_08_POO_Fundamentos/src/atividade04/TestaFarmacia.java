package atividade04;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		Farmacia m1 = new Farmacia("Diporana", 35, "Generico", 10.00d, 1);
		m1.visual();
		System.out.println();
		Farmacia p1 = new Farmacia("Malbec blue", 10, "o Boticário", 189.90d, 2);
		p1.visual();
		System.out.println();
		Medicamento m2 = new Medicamento("Clonazepam", 32, "Generico", 8.99d, 2, 1);
		m2.visual();
		System.out.println();
		Medicamento m3 = new Medicamento("Histamina", 27, "Histamin", 8.29d, 2, 2);
		m3.visual();
	}
}
