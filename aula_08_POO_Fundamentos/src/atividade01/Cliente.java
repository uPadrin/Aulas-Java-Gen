package atividade01;

public class Cliente {

	private String nome;
	private int genero;
	private int idade;
	private int tipo;
	private String tel;

	// Criamos o Método Construtor
	public Cliente(String nome, int genero, int idade, int tipo, String tel) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.tipo = tipo;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int isTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void visual() {
		
		String tipo = "";

		switch (this.tipo) {

		case 1 -> tipo = "Pessoa Fisica";
		case 2 -> tipo = "Pessoa Juridica";
		}
		String genero = "";
		switch (this.genero) {
		case 1 -> genero = "Masculino";
		case 2 -> genero = "Feminino";
		case 3 -> genero = "Não binario";
		}

		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("Genero do cliente: " + genero);
		System.out.println("Tipo da cliente: " + tipo);
		System.out.println("Idade: " + this.idade);
		System.out.println("Telefone: " + this.tel);
	}

}
