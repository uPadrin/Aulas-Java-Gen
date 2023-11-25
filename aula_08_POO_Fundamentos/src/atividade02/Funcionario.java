package atividade02;

public class Funcionario {

	private String nome;
	private int idade;
	private int cargo;
	private float salario;
	private int tempo;
	
	public Funcionario(String nome, int idade, int cargo, float salario, int tempo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public void visual() {
		
		String cargo = "";
		
		switch(this.cargo) {
		case 1 -> cargo = "Vendedor";
		case 2 -> cargo = "Gerente";
		}
		System.out.println("Nome do funcionario: " + this.nome);
		System.out.println("Idade do funcionario: " + this.idade);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + this.salario);
		System.out.println("Tempo de empresa: " + this.tempo +" anos");
		
	}
	
	
}
