package aula_02;

	import java.util.Scanner;

public class Exer03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			float salario, addnoturno, horasextras, desconto;

			System.out.println("Insira a Sal�rio Bruto: ");
			salario = leia.nextFloat();

			System.out.println("Insira a Adicional Noturno: ");
			addnoturno = leia.nextFloat();
			
			System.out.println("Insira a Horas Extras: ");
			horasextras = leia.nextFloat();
			
			System.out.println("Insira a Desconto: ");
			desconto = leia.nextFloat();
			
			System.out.println("O valor � do Sal�rio L�quido " + (salario+addnoturno+(horasextras*5)-desconto));

	}

}
