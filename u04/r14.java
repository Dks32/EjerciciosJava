/*
 *  Diseñar una función que calcule el n-ésimo término de la serie de
 *  Fibonacci. En esta serie el n-ésimo valor se calcula sumando los dos
 *  valores anteriores. Es decir:
 *    fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
 *    fibonacci(0) = 1
 *    fibonacci(1) = 1
 */


public class r14 {
	// Función recursiva para el calculo de fibonacci
	static int fibonacci(int num) {
		int resultado;

		if (num == 0) {
			resultado = 1;
		} else if (num == 1) {
			resultado = 1;
		} else {
			resultado = fibonacci(num - 1) + fibonacci(num - 2);
		}

		return(resultado);
	}


	// Programa para probar la función fibonacci
	public static void main(String args[]) {
		// Calcular los primeros 25 números de la serie fibonacci
		for (int i=0; i<=25; i++) {
			System.out.println(fibonacci(i));
		}
	}
}
