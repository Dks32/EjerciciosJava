import java.util.Scanner;


/*
 *  Pedir por consola un número n y dibujar un triángulo rectángulo de n
 *  elementos de lado, utilizando para ello asteriscos (*). Por ejemplo,
 *  para n=4:
 *      * * * *
 *      * * *
 *      * *
 *      *
 */


public class r14 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n, i, j;

		System.out.print("Ingrese tamaño del triángulo: ");
		n = scan.nextInt();

		// Ciclo i -> Filas del triángulo
		for (i=0; i<n; i++) {
			// Ciclo ij-> Columnas del triángulo
			for (j=0; j<(n-i); j++) {
				System.out.print(" *");
			}
			// Salto de línea al final de una fila
			System.out.println();
		}
	}
}
