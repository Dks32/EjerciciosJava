import java.util.Scanner;


/*
 *  Escribir una función a la que se le pasen dos enteros y muestre todos los
 *  números comprendidos entre ellos.
 */


public class r02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1, n2;

		System.out.println("Ingrese dos números: ");
		System.out.print(" * Numero 1: ");
		n1 = scan.nextInt();
		System.out.print(" * Numero 2: ");
		n2 = scan.nextInt();

		numerosEntre(n1, n2);
	}


	static void numerosEntre(int n1, int n2) {
		// Si n1 > n2 intercambiarlos
		if (n1>n2) {
			int aux = n1;
			n1 = n2;
			n2 = aux;
		}

		// Mostrar los numeros entre n1 y n2
		for (int i=n1; i<=n2; i++) {
			System.out.println(i);
		}
	}
}
