import java.util.Scanner;


/*
 *  Diseñar una función que calcula a**n (a a la potencia n), donde a es real
 *  y n entero no negativo. Realizar una versión iterativa y otra recursiva.
 */


public class r11 {
	// función de potencia iterativa
	static double potenciaIterativa(double a, int n) {
		double resultado = 1;

		if (n != 0) {
			for (int i=1; i<=n; i++) {
				resultado *= a;
			}
		}

		return resultado;
	}


	// función de potencia recursiva
	static double potenciaRecursiva(double a, int n) {
		double resultado = 1;

		if (n != 0) {
			resultado = a * potenciaRecursiva(a, n-1);
		}

		return resultado;
	}


	// Programa para probar las funcioness
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		double a;
		int n;

		System.out.println("Calculo de Potencias");
		System.out.print("Ingrese un número: ");
		a = scan.nextDouble();
		System.out.print("Ingrese el exponente: ");
		n = scan.nextInt();

		System.out.println("con recursividad: " + potenciaRecursiva(a, n));
		System.out.println("con iteraciones: " + potenciaIterativa(a, n));
	}
}
