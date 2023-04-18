import java.util.Scanner;


/*
 *  Escribir una aplicación que indique cuántas cifras tiene un número entero
 *  introducido por teclado, que estará comprendido entre 0 y 99.999
 */


public class r09 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, cifras;

		System.out.print("Ingrese un número (0-99.999): ");
		num = scan.nextInt();

		// Utilizo el operador ternario para encontrar la cantidad de cifras del numero
		cifras = 1;
		cifras = (num >= 10) ? 2 : cifras;
		cifras = (num >= 100) ? 3 : cifras;
		cifras = (num >= 1000) ? 4 : cifras;
		cifras = (num >= 10000) ? 5 : cifras;
		cifras = (num >= 100000) ? -1 : cifras; // Fuera del rango solicitado

		if (cifras != -1) {
			// Si el número de cifras está dentro de lo solicitado (max 5 cifras)
			System.out.println("El número " + num + " tiene " + cifras + " cifras.");
		} else {
			// Si el número de cifras está fuera del rango solicitado (más de 5 cifras)
			System.out.println("El número " + num + " tiene más de 5 cifras");
		}
	}
}
