package atividade03;

public class Jogo extends Produto {
	private String genero;

	public Jogo(String nome, double preco, int estoque, int data, int tipo, String genero) {
		super(nome, preco, estoque, data, tipo);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void visual() {
		super.visual();
		System.out.println("Gênero: " + genero);
	}
}
