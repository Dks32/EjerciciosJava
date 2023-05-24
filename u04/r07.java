import java.util.Scanner;


/*
 *  Diseñar una función que nos diga si un número es primo.
 *  Un número n es primo si no es divisible por ningún número entre 2 y n-1, 
 *  en otras palabras, un número primo solo es divisible por 1 y por si mismo.
 */


public class r07 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num;
		System.out.print("Número a verificar si es primo: ");
		num = scan.nextInt();

		System.out.println(num + " es primo?: " + (esPrimo(num) ? "Si":"No"));
	}

	static boolean esPrimo(int num) {
		// Para verificar si un número es primo no hace falta verificar todos
		// los números entre 2 y n-1, con verificar hasta n/2 es suficiente.
		boolean divisible = false;

		// Buscar divisores entre 2 y n/2
		for (int i=2; i<=(num/2); i++) {
			divisible = (num % i == 0) ? true : false; // i es divisor de n?

			if (divisible) {
				// si se encuentra divisor el número no es primo y no hace falta
				// seguir buscando divisores: salir del loop
				break;
			}
		}

		return !divisible; // Los numeros primos son aquellos a los que NO encontramos divisores
	}
}
