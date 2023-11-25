package atividade03;

public class Console extends Produto {

	private String controle;

	public Console(String nome, double preco, int estoque, int data, int tipo, String controle) {
		super(nome, preco, estoque, data, tipo);
		this.controle = controle;
	}

	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}
	public void visual() {
	super.visual();
	System.out.println("Controle: " + controle);
	}
}
