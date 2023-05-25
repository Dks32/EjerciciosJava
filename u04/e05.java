import java.util.Scanner;


/*
 *  Diseñar una función a la que se le pasan las horas y minutos de dos
 *  instantes de tiempo, con el prototipo:
 *    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
 *  La función devolverá la cantidad de minutos que existen de diferencia entre
 *  los dos instantes utilizados.
 */


public class e05 {
	static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		minuto1 += hora1 * 60; // convertir hora1 a minutos y sumarlos a minuto1
		minuto2 += hora2 * 60; // convertir hora2 a minutos y sumarlos a minuto2

		return minuto2 - minuto1; // devolver la diferencia de tiempo en minutos
	}


	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int hora1, minuto1, hora2, minuto2;

		System.out.println("Momento 1");
		System.out.print("  hora?: ");
		hora1 = scan.nextInt();
		System.out.print("  minuto?: ");
		minuto1	= scan.nextInt();
		System.out.println("Momento 2");
		System.out.print("  hora?: ");
		hora2 = scan.nextInt();
		System.out.print("  minuto?: ");
		minuto2 = scan.nextInt();

		System.out.println("Diferencia entre momentos: " + diferenciaMin(hora1, minuto1, hora2, minuto2) + " minutos.");
	}
}
