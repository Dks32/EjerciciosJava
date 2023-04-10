import java.util.Scanner;


/*
 *  Escribir un programa que tome como entrada un número entero y nos indique
 *  qué cantidad hay que sumarle para que el resultado sea múltiplo de 7.
 */


public class e02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, res;

		System.out.println("Ingrese un número: ");
		num = scan.nextInt();

		res = 7 - (num % 7);

		System.out.println("A " + num + " le falta " + res + " para se múltiplo de 7.");
	}
}
