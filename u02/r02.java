import java.util.Scanner;


/*
 *  Consigna
 */


public class r02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1, n2;

		System.out.print("Ingrese n1: ");
		n1 = scan.nextInt();
		System.out.print("Ingrese n2: ");
		n2 = scan.nextInt();

		if (n1 == n2) {
			System.out.println(n1 + " y " + n2 + " son iguales.");
		} else {
			System.out.println(n1 + " y " + n2 + " no son iguales.");
		}
	}
}
