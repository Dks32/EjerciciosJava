import java.util.Scanner;


/*
 *  Diseñar la función calculadora(), a la que se le pasan dos números enteros
 *  (operandos) y qué operación se desea realizar con ellos. Las operaciones
 *  disponibles son: sumar, restar, multiplicar o dividir. Estas se
 *  especifican mediante un número: 1 para la suma, 2 para la resta, 3 para la
 *  multiplicación y 4 para la división. La función devolverá el resultado de *  la operación mediante un número real.
 */


public class r12 {
	// Función calculadora
	static double calculadora(int a, int b, int operacion) {
		double resultado = 0;

		switch (operacion) {
			case 1:
				// suma
				resultado = a + b;
				break;
			case 2:
				// resta
				resultado = a - b;
				break;
			case 3:
				// Multiplicación
				resultado = a * b;
				break;
			case 4:
				// división
				if (b != 0) {
					resultado = a / b;
				} else {
					// Si b == 0 entonces error
					System.out.println("Error: División entre 0");
				}
				break;
			default:
				// Si la operación elegida no está entre las anteriores
				System.out.println("Operación no admitida");
				break;
		}

		return resultado;
	}


	// Programa para probar la función calculadora
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int operacion, a, b;
		char opsg;

		System.out.println("Calculadora\n===========");
		System.out.println("  1. Suma");
		System.out.println("  2. Resta");
		System.out.println("  3. Multiplicación");
		System.out.println("  4. División");
		System.out.print("Operacion: ");
		operacion = scan.nextInt();
		System.out.print("Valor de a: ");
		a = scan.nextInt();
		System.out.print("Valor de b: ");
		b = scan.nextInt();

		System.out.println("Resultado: " + calculadora(a, b, operacion));
	}
}
