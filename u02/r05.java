import java.util.Scanner;
import java.util.Locale;


/*
 *  Implementar un programa que pida por teclado un número decimal e indique
 *  si es un número casi-cero, que son aquellos, positivos o negativos, que se
 *  acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se
 *  considera un número casi-cero. Ejemplos de números casi-cero son el 0.3,
 *  el -0.99 o el 0.123. Y números que no se consideran casi-ceros son: el
 *  12.3, el 0 o el -1.
 */


public class r05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		Float num;

		System.out.print("Ingrese un número con parte decimal: ");
		num = scan.nextFloat();

		if ((num < 1) && (num > -1) && (num != 0)) {
			System.out.println(num + ": Es un número casi-cero.");
		} else {
			System.out.println(num + ": No es un número casi-cero.");
		}
	}
}
