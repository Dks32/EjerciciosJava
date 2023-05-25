import java.util.Scanner;


/*
 *  Escribir una función a la que se pasen como parámetros de entrada una
 *  cantidad de días, horas y minutos. La función calculará y devolverá el
 *  número de segundos que existen en los datos de entrada.
 */


public class e04 {
	static int segundos(int dias, int horas, int minutos) {
		dias *= 24 * 60 * 60; // convertir dias a segundos
		horas *= 60 * 60; // convertir horas a segundos
		minutos *= 60; // convertir minutos a segundos

		return minutos + horas + dias; // Regresar la suma de los valores convertidos
	}


	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int dias, horas, minutos;

		System.out.print("Dias?: ");
		dias = scan.nextInt();
		System.out.print("Horas?: ");
		horas = scan.nextInt();
		System.out.print("Minutos?: ");
		minutos = scan.nextInt();

		System.out.println("Cantidad de segundos: " + segundos(dias, horas, minutos));
	}
}
