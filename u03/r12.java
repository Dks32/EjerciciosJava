import java.util.Scanner;


/*
 *  Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */


public class r12 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nota = 0, susp = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Ingrese nota [" + i + "]: ");
			nota = scan.nextInt();

			// Si nota es menor a 6 se incrementa susp
			susp = (nota < 6) ? susp + 1 : susp;
		}

		if (nota != 0) {
			System.out.println("Hay alumnos suspendidos.");
		} else {
			System.out.println("No hay alumnos suspendidos.");
		}
	}
}
