import java.util.Scanner;


/*
 *  Diseñar una aplicación que solicite al usuario un número e indique si es par
 *  o impar.
 */


public class r01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Ingrese un número: ");
		num = scan.nextInt();

		if ((num % 2) == 0) {
			System.out.println(num + " es par.");
		} else {
			System.out.println(num + " es impar.");
		}
	}
}
