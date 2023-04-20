/*
 *  Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
 */


public class r11 {
	public static void main(String args[]) {

		int prod;

		// Ciclo para el primer múltiplo
		for (int m = 1; m <= 10; m++) {

			// Ciclo para el segundo múltiplo
			for (int n = 1; n <= 10; n++) {
				// Calcular el producto de m y n
				prod = m * n;

				// Mostrar la operación y resultado
				System.out.println(m + " x " + n + " = " + prod);
			}

			System.out.println(); // Salto de linea
		}
	}
}
