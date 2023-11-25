package atividade02;

public class Vendedor extends Funcionario {
	private String gerente;

	public Vendedor(String nome, int idade, int cargo, float salario, int tempo, String gerente) {
		super(nome, idade, cargo, salario, tempo);
		this.gerente = gerente;

	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public void visual() {
		super.visual();
		System.out.println("Gerente responsavel: "+ gerente);
	}
}
