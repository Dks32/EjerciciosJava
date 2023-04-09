import java.util.Scanner;


/*
 *  Diseñar un programa que pida un número al usuario (por teclado) y a
 *  continuación lo muestre.
 */


public class r01 {
	public static void main(String args[]) {
		int numero;
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		numero = scan.nextInt();

		System.out.println("El número ingresado es: " + numero);
	}
}
