package atividade04;

public class Medicamento extends Farmacia {

	private int bula;
	public Medicamento(String nome, int estoque, String marcar, double preco, int tipo, int bula) {
		super(nome, estoque, marcar, preco, tipo);
		this.bula = bula;
		
	}
	public int getBula() {
		return bula;
	}
	public void setBula(int bula) {
		this.bula = bula;
	}
	public void visual() {
		super.visual();
		String bula = "";
		switch(this.bula) {
		case 1 -> bula = "Apenas com prescri��o medica";
		case 2 -> bula = "N�o precisa de prescri��o medica";
		}
		System.out.println(bula);
		
	}
}
