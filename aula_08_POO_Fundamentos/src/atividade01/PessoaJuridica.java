package atividade01;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String nome, int genero, int idade, int tipo, String tel, String cnpj) {
		super(nome, genero, idade, tipo, tel);
		this.cnpj = cnpj;

	}

	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public void visual() {
		super.visual();
		System.out.println("CNPJ: " + cnpj);
}
}
