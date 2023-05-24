import java.util.Scanner;


/*
 *  Consigna
 */


public class r09 {
	static void divisoresPrimos(int num) {
		System.out.println("Divisores primos para " + num + ":");
		for (int i=1; i<=num; i++) {
			if ((num % i) == 0 && esPrimo(i)) {
				System.out.println(i);
			}
		}
	}


	public static void main(String args[]) {
		// Programa para probar la función divisoresPrimos
		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Ingrese un número: ");
		num = scan.nextInt();

		divisoresPrimos(num);
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
