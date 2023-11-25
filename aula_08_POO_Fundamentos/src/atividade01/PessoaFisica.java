package atividade01;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String nome, int genero, int idade, int tipo, String tel, String cpf) {
		super(nome, genero, idade, tipo, tel);
		this.cpf = cpf;

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public void visual() {
		super.visual();
		System.out.println("CPF: " + cpf);
	}

}
