import java.util.Scanner;


/*
 *  Dado un polinomio de segundo grado (y = ax^2 + bx + c), crear un programa
 *  que pida los coeficientes a, b y c, así como el valor de x, y calcule el
 *  valor correspondiente de y.
 */


public class e05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		double x, a, b, c, y;

		System.out.println("y = ax^2 + bx + c");
		System.out.println("Ingrese los valores solicitados:");
		System.out.print("X = ");
		x = scan.nextDouble();
		System.out.print("a = ");
		a = scan.nextDouble();
		System.out.print("b = ");
		b = scan.nextDouble();
		System.out.print("c = ");
		c = scan.nextDouble();

		y = (a*x*x) + (b*x) + (c);

		System.out.println(y + " = (" + a + " * " + x + "^2) + (" + b + " * " + x + ") + " + c);
	}
}
