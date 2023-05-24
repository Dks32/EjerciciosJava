import java.util.Scanner;


/*
 *  Escribir una función que decida si dos números enteros positivos son
 *  amigos. Dos números son amigos si la suma de sus divisores propios
 *  (distintos de ellos mismos) son iguales.
 */


public class r10 {
	// Función para verificar números amigos
	static boolean sonAmigos(int a, int b) {
		// return sumaDivisores(a) == sumaDivisores(b);
		return (a == sumaDivisores(b)) && (b == sumaDivisores(a));
	}


	// Función para sumar divisores propios de un número
	static int sumaDivisores(int num) {
		int suma = 0;

		for (int i=1; i<num; i++) {
			if (num % i == 0) {
				suma += i;
			}
		}

		return suma;
	}


	// Programa para probar la funcióon sonAmigos
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1, n2;

		System.out.println("Verificar Numeros Amigos");
		System.out.print("Ingrese num 1: ");
		n1 = scan.nextInt();
		System.out.print("Ingrese num 2: ");
		n2 = scan.nextInt();

		System.out.println("\n - " + n1 + " y " + n2 + " son amigos?: " + sonAmigos(n1, n2));
	}
}
