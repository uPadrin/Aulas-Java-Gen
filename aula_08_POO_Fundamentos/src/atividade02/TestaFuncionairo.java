package atividade02;

public class TestaFuncionairo {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Gabriel", 25, 1, 6000.00f, 4);
		f1.visual();
		System.out.println();
		Funcionario f2 = new Funcionario("Daniel", 42, 2, 14000.00f, 10);
		f2.visual();
		System.out.println();
		Gerente g1 = new Gerente("Aldemar", 40, 2, 9000.00f, 7, 4);
		g1.visual();
		System.out.println();
		Gerente g2 = new Gerente("Francis", 52, 2, 20000.00f, 22, 1);
		g2.visual();
		System.out.println();
		Vendedor v1 = new Vendedor("Sebastião", 25, 1, 2000.00f, 1, "Francis");
		v1.visual();
		System.out.println();
		Vendedor v2 = new Vendedor("Mateus", 22, 1, 2000.00f, 2, "Aldemar");
		v2.visual();
	}

}
