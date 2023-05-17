import java.util.Scanner;


/*
 *  Diseñar la funcion eco() a la que se le pasa como parámetro un número n, y
 *  muestra por pantalla n veces el mensaje: "Eco..."
 */


public class r01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n; // Parametro para eco()

		System.out.print("Ingrese un número: ");
		n = scan.nextInt();

		// Llamada a función eco() pasando el parametro n
		eco(n);
	}

	static void eco(int n) {
		for (int i=0; i<n; i++) {
			System.out.println("Eco...");
		}
	}
}
