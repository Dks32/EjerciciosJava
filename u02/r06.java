import java.util.Scanner;


/*
 *  Pedir dos números y mostrarlos de forma decreciente.
 */


public class r06 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num1, num2;

		System.out.print("Ingrese numero 1: ");
		num1 = scan.nextInt();
		System.out.print("Ingrese numero 2: ");
		num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " | " + num2);
		} else {
			System.out.println(num2 + " | " + num1);
		}
	}
}
