import java.util.Scanner;


/*
 *  Crear un programa que pida la base y la altura de un triángulo y muestre
 *  su área.
 */


public class e04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		double base, altura, area;

		System.out.print("Ingrese base de un triangulo: ");
		base = scan.nextInt();
		System.out.print("Ingrese altura  de un triangulo: ");
		altura = scan.nextInt();

		area = (base * altura) / 2;

		System.out.println("Area del triangulo: " + area);
	}
}
