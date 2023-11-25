package atividade03;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;
	private int data;
	private int tipo;
	
	public Produto(String nome, double preco, int estoque, int data, int tipo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.data = data;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visual() {
	
	String tipo = "";
	
	switch(this.tipo) {
	case 1 -> tipo = "Jogo";
	case 2 -> tipo = "Console";
	}
	System.out.println("Nome do Console: " + this.nome);
	System.out.println("Ano de lançamento: " + this.data);
	System.out.println("Preço: " + this.preco);
	System.out.println("Estoque: " + this.estoque);
	System.out.println("Tipo: " + tipo);
}
}
