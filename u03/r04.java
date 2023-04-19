import java.util.Scanner;


/*
 *  Escribir una aplicación para aprender a contar, que pedirá un número n y
 *  mostrará todos los números del 1 a n.
 */


public class r04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num, i;

		System.out.print("Ingrese un número positivo: ");
		num = scan.nextInt();

		for (i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
