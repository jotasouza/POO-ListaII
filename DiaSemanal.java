package Lista2;

import java.util.Scanner;

public class DiaSemanal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("==== Dia da semana ====");
		System.out.print("Informe um n�mero: ");
		num = entrada.nextInt();		
		
		switch(num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
			default:
				System.out.println("Valor Inv�lido.");
		}
		entrada.close();
	}

}
