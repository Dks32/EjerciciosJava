import java.util.Scanner;


/*
 *  Sería interesante disponer de un programa que pida como entrada un número
 *  decimal y lo meustre redondeado al entero más próximo.
 */


public class r07 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		float num;
		int res;

		System.out.print("Ingrese un número para redondear: ");
		num = scan.nextFloat();

		res = (int) (num + 0.5);
		System.out.println("El número " + num + " fue redondeado a " + res);
	}
}