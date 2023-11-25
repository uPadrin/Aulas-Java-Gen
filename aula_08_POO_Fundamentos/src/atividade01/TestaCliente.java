package atividade01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Bryan", 1, 21, 1, "11944445555");
		c1.visual();
		System.out.println("");
		Cliente c2 = new Cliente("Pablo", 2, 24, 1, "11955556666");
		c2.visual();
		System.out.println("");
		PessoaFisica pf1 = new PessoaFisica("Mateus", 1, 28, 1, "11 5484-4313", "333.111.222-55");
		pf1.visual();
		System.out.println("");
		PessoaFisica pf2 = new PessoaFisica("Maria", 2, 24, 1, "11 95465-5648", "323.541.652-11");
		pf2.visual();
		System.out.println("");
		PessoaJuridica pj1 = new PessoaJuridica("Fernanda", 2, 30, 2, "11 94896-8648", "15.879.487/0001-08.");
		pj1.visual();
		System.out.println("");
		pj1.setIdade(33);
		pj1.visual();
		System.out.println("");
		PessoaJuridica pj2 = new PessoaJuridica("Amanda", 2, 26, 2, "11 1185-9875", "11.548.668/0001-05.");
		pj2.visual();
	}
}
