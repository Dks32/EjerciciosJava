import java.util.Scanner;


/*
 *  Se desea implementar una aplicación que pida al usuario que introduzca un
 *  número comprendido entre 1 y 10. Debemos mostrar la tabla de multiplicar
 *  de dicho número. El código tendrá que asegurarse de que el número
 *  introducido se encuentra entre el 1 y el 10.
 */


public class r10 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num = 0, prod;

		do {
			System.out.print("Ingrese un número (1-10): ");
			num = scan.nextInt();

			if ((num < 1) || (num > 10)) {
				System.out.println(" - El número debe estar entre 1 y 10");
			}
		} while ((num < 1) || (num > 10));

		// Recorremos los valores de i desde el 1 al 10 y mostramos el producto i * num
		for (int i = 1; i <= 10; i++) {
			prod = i * num;
			System.out.println(num + " x " + i + " = " + (i * num));
		}
	}
}
