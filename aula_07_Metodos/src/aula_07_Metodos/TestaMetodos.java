package aula_07_Metodos;

public class TestaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Chamadas para os m�todos locais
		
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();
		
		// Chamadas para os m�todos da Classe 0
		
	Classe01.metodoPublico01();
	Classe01.metodoFriendly01();
	Classe01.metodoProtegido01();
		
	}

	public static void metodoPublico() {
		System.out.println("M�todo Publico");
	}
	static void metodoFriendly() {
		System.out.println("M�todo Friendly");
	}
	protected static void metodoProtegido() {
		System.out.println("M�todo Protegido");
	}
	private static void metodoPrivado() {
		System.out.println("M�todo Privado");
	}
}


