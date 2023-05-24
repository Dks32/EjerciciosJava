import java.util.Scanner;


/*
 *  Consigna
 */


public class r08 {
	static int numDivisoresPrimos(int num) {
		int cuenta = 0;

		// Buscar divisores para num
		for (int i=1; i<=num; i++) {
			if (esPrimo(i)) {
				// Si i es primo incrementamos en 1 la cuenta si (num % i == 0)
				cuenta = cuenta + ((num % i) == 0 ? 1: 0);
			}
		}

		return cuenta;
	}


	public static void main(String args[]) {
		// Programa utilizado para probar la función numDivisoresPrimos
		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Ingrese un número: ");
		num = scan.nextInt();

		System.out.println(num + " tiene " + numDivisoresPrimos(num) + " divisores primos.");
	}

	static boolean esPrimo(int num) {
		// Función creada en el ejercicio anterior (r0407)
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
