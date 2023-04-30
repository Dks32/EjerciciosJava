import java.util.Scanner;


/*
 *  Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
 *  y suspensos.
 */


public class r13 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nota, aprobados=0, condicionados=0, suspensos=0;

		// Bucle para el ingreso de las notas
		for (int i=1; i<=6; i++) {
			System.out.print("[" + i + "] Ingrese nota: ");
			nota = scan.nextInt();

			// Si la nota es igual a 4 son alumnos condicionados
			if (nota == 4) {
				condicionados++;
				continue; // Saltar al siguiente ciclo.
			}

			// Si la nota es menor a 4 son alumnos suspendidos
			if (nota < 4) {
				suspensos++;
				continue; // Saltar al siguiente ciclo
			}

			// Si no se dieron los casos anteriores entonces son alumnos aprobados
			aprobados++;
		}

		System.out.println("Alumnos aprobados: " + aprobados);
		System.out.println("Alumnos condicionados: " + condicionados);
		System.out.println("Alumnos suspensos: " + suspensos);
	}
}
