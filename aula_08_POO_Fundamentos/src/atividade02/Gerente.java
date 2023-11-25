package atividade02;

public class Gerente extends Funcionario {

	private int time;
	
	public Gerente(String nome, int idade, int cargo, float salario, int tempo, int time) {
		super(nome, idade, cargo, salario, tempo);
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	public void visual() {
		super.visual();
		System.out.println("Time: " + time);
	}
	
}
