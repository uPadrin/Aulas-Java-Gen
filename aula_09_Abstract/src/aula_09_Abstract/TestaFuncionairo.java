package aula_09_Abstract;

public class TestaFuncionairo {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Maria", 1, 20000.00f,1000.00f);
		System.out.println("Sal�rio Calculado: " + g1.calcularSalario());
		
		Vendedor v1 = new Vendedor ("Bryan", 2, 5000.00f, 0.10f);
		System.out.println("Sal�rio Calculado: " + v1.calcularSalario());
	}

}
