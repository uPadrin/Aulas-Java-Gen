package atividade04;

public class Farmacia {

	private String nome;
	private int estoque;
	private String marcar;
	private double preco;
	private int tipo;

	public Farmacia(String nome, int estoque, String marcar, double preco, int tipo) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.marcar = marcar;
		this.preco = preco;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getMarcar() {
		return marcar;
	}

	public void setMarcar(String marcar) {
		this.marcar = marcar;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visual() {
		String tipo = "";
		switch (this.tipo) {
		case 1 -> tipo = "Medicamento";
		case 2 -> tipo = "Perfumaria";
		}
		System.out.println("Produto: " + nome);
		System.out.println("Estoque: " + estoque);
		System.out.println("Marca: " + marcar);
		System.out.println("Preços: " + preco);
		System.out.println("Tipo: " + tipo);
	}
}
