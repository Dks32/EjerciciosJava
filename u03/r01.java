import java.util.Scanner;


/*
 *  Diseñar un programa que muestre, para cada número introducido por teclado,
 *  si es par, si es positivo y su cuadrado. El proceso se repetirá hasta que
 *  el número introducido por teclado sea 0.
 */


public class r01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, cuadrado;
		String paridad, positividad;

		// Bucle infinito (dentro del bucle se indicará la salida con un break)
		while (true) {
			System.out.print("Ingrese un número (0 para salir): ");
			num = scan.nextInt();

			// Salir si num = 0
			if (num == 0) {break;}

			// Verificar e indicar paridad
			paridad = ((num % 2) == 0) ? "Par " : "Impar ";
			System.out.println(" > Paridad: " + paridad);

			// Verificar e indicar positividad
			positividad = (num > 0) ? "Positivo " : "Negativo ";
			System.out.println(" > Positividad: " + positividad);

			// Calcular e indicar el cuadrado
			cuadrado = num * num;
			System.out.println(" > Cuadrado: " + cuadrado + "\n");
		};
	}
}
