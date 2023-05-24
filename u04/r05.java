import java.util.Scanner;


/*
 *  Repetir el ejercicio anterior con una versión que calcule el máximo de 3
 *  números.
 */


public class r05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Ingrese numero 1: ");
		n1 = scan.nextInt();
		System.out.print("Ingrese numero 2: ");
		n2 = scan.nextInt();
		System.out.print("Ingrese numero 3: ");
		n3 = scan.nextInt();

		// Mostrar el resultado de la llamada a funcion maximo(n1, n2, n3)
		System.out.println("El mayor es: " + maximo(n1, n2, n3));
	}

	// Función máximo de 2
	static int maximo(int n1, int n2) {
		return(n1 > n2 ? n1 : n2); // Si n1 > n2 devuelve n1: sino devuelve n2
	}

	// Función máximo de 3
	static int maximo(int n1, int n2, int n3) {
		int res;
		res = maximo(n1, n2);
		res = maximo(res, n3);
		return(res);
	}

}
