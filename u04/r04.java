import java.util.Scanner;


/*
 *  Diseñar una función que reciba como parámetros dos números enteros y que
 *  devuelva el máximo (el mayor de los dos).
 */


public class r04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1, n2;

		System.out.print("Ingrese numero 1: ");
		n1 = scan.nextInt();
		System.out.print("Ingrese numero 2: ");
		n2 = scan.nextInt();

		System.out.println("El mayor es: " + maximo(n1, n2));
	}


	static int maximo(int n1, int n2) {
		return(n1 > n2 ? n1 : n2);
	}
}
