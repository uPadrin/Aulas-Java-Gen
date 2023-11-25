package atividade03;

public class TestaGame {

	public static void main(String[] args) {

		Produto jg1 = new Produto("Grand Theft Auto V", 66.66d, 10, 2013, 1);
		jg1.visual();
		System.out.println();
		Produto cs1 = new Produto("Xbox 360", 836.00d, 2, 2005, 2);
		cs1.visual();
		System.out.println();
		Jogo jg2 = new Jogo("Red Dead Redemption 2", 300.00d, 7, 2018, 1, "Faroeste");
		jg2.visual();
		System.out.println();
		Jogo jg3 = new Jogo("Sekiro: Shadows Die Twice", 274.00d, 5, 2019, 1, "RPG eletrônico de ação");
		jg3.visual();
		System.out.println();
		Console cs2 = new Console("PlayStation 5", 4499.90d , 3, 2022, 2, "DualSense");
		cs2.visual();
		System.out.println();
		Console cs3 = new Console("Xbox Series X", 4300.00d , 2, 2020, 4, "Controle sem Fio Xbox");
		cs3.visual();
	}

}
