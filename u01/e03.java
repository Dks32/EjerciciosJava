import java.util.Scanner;


/*
 *  Modificar el ejercicio anterior para que, indicando dos números n y m, nos
 *  diga qué cantidad hay que sumarle a n para que sea múltiplo de m.
 */


public class e03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nn, nm, res;

		System.out.print("Ingrese un número (n): ");
		nn = scan.nextInt();

		System.out.print("Ingrese un número (m): ");
		nm = scan.nextInt();

		res = nm - (nn % nm);

		System.out.println("A " + nn + " le falta " + res + " para se múltiplo de " + nm);
	}
}
