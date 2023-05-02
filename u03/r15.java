import java.util.Scanner;


/*
 *  Realizar un programa que nos pida un número n, y nos diga cuántos números
 *  hay entre 1 y n que sean primos. Un número primo es aquél que solo es
 *  divisible por 1 y por él mismo. Por ejemplo para n=8 el resultado será 5.
 */


public class r15 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n,        // Numero elegido
			primos=0; // Contador de números primos
		boolean b;    // Bandera para numeros primos

		System.out.print("Ingrese un número (n>=1): ");
		n = scan.nextInt();

		// Buscar numeros primos entre i y n, inclusive.
		for (int i=1; i<=n; i++) {
			b = true; // Inicializar bandera de numero primo
			for (int j=2; j<i; j++) {
				// Buscar divisores distintos a 1 y a n
				if ((i % j) == 0) {
					b = false; // Si se encuentra divisor el numero no es primo
					break; // Salir del bucle (ya no hace falta buscar más divisores)
				}
			}

			// Incrementar la cantidad de numeros primos si i es primo
			if (b) primos++; // Cuando el bloque condicional es de una linea no hacen falta {}
		}

		System.out.println("Cantidad de números primos entre 1 y " + n + " (inclusive) es: " + primos);
	}
}
