import java.util.Scanner;


/*
 *  Solicitar dos números distintos y mostrar cuál es el mayor.
 */


public class r03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1, n2;

		System.out.print("Ingrese un número (n1): ");
		n1 = scan.nextInt();
		System.out.print("Ingrese un número distinto a n1 (n2): ");
		n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("El mayor es: " + n1);
		} else if (n1 < n2) {
			System.out.println("El mayor es: " + n2);
		}
	}
}
