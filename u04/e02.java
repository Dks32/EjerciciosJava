import java.util.Scanner;


/*
 *  Crear la función muestraPares(int n) que muestre por consola los primeros
 *  n números pares.
 */


public class e02 {
	static void muestraPares(int n) {
		for (int i=1; i<=n; i++) {
			System.out.println(i * 2);
		}
	}


	// Programa para probar la función muestraPares
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("¿Cantidad de pares?: ");
		int n = scan.nextInt();

		System.out.println("Primeros " + n + " números pares:");
		muestraPares(n);
	}
}
