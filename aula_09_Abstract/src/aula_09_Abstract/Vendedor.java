package aula_09_Abstract;

public class Vendedor extends Funcionario implements CalcularSalario {

	private float comissao;

	public Vendedor(String nome, int cargo, float salario, float comissao) {
		super(nome, cargo, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public void visual() {
		super.visual();
		System.out.println("Comissão: " + this.comissao);
	}

	@Override
	public float calcularSalario() {
		return (comissao * this.getSalario()) + this.getSalario() ;
	}
}
