package aula_02;

	import java.util.Scanner;

public class Exer03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			float salario, addnoturno, horasextras, desconto;

			System.out.println("Insira a Salário Bruto: ");
			salario = leia.nextFloat();

			System.out.println("Insira a Adicional Noturno: ");
			addnoturno = leia.nextFloat();
			
			System.out.println("Insira a Horas Extras: ");
			horasextras = leia.nextFloat();
			
			System.out.println("Insira a Desconto: ");
			desconto = leia.nextFloat();
			
			System.out.println("O valor é do Salário Líquido " + (salario+addnoturno+(horasextras*5)-desconto));

	}

}
