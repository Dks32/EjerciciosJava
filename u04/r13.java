import java.util.Scanner;


/*
 *  Calcular el factorial de n recursivamente. Recordar que por definición el
 *  factorial de 0 (0!) es 1.
 */


public class r13 {
	// Función factorialRecursivo
	static int factorialRecursivo(int n) {
		int resultado;

		if (n == 0) {
			resultado = 1; // 0! = 1
		} else {
			resultado = n * factorialRecursivo(n-1);
		}

		return(resultado);
	}



	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		int num = scan.nextInt();

		System.out.println(num + "! = " + factorialRecursivo(num));
	}
}
