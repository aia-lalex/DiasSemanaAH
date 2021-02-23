package DiasSemana;

import java.util.Scanner;

public class DiasSemana {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		decisionDia();
	}

	/**
	 * 
	 */
	public static void decisionDia() {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int N = 0;
		String diaR="";
		System.out.println("Introduce un Número: ");
		N = reader.nextInt();
		if (N == 1)
			diaR="Lunes";
		else if (N == 2)
			diaR="Martes";
		else if (N == 3)
			diaR="Miércoles";
		else if (N == 4)
			diaR="Jueves";
		else if (N == 5)
			diaR="Viernes";
		else if (N == 6)
			diaR="Sábado";
		else if (N == 7)
			diaR="Domingo";
		else
			diaR="Número no válido";
		reader.close();
		System.out.println (diaR);
	}
}