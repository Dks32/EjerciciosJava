import java.util.Scanner;


/*
 *  Implementar la aplicación eco, que pide al usuario un número y muestre en
 *  pantalla la salida:
 *   Eco...
 *   Eco...
 *   Eco...
 *  que muestre "Eco..." tantas veces como indique el número introducido. La
 *  salida anterior sería para el número 3.
 */


public class e03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Ingrese un número: ");
		num = scan.nextInt();

		for (int i=1; i<=num; i++) {
			System.out.println("Eco...");
		}
	}
}
