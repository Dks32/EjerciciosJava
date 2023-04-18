import java.util.Scanner;


/*
 *  Pedir los coeficientes de una ecuación de 2° grado, y mostrar sus
 *  soluciones reales. Si no existen, debe indicarlo. Recordemos que las
 *  soluciones de una ecuación de segundo grado ax^2 + bx + c = 0 son:
 *
 *  x = (-b +- sqrt(b^2 - 4ac))
 */


public class r08 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

        // Coeficientes
        double a, b, c;
        // Discriminantes
        double disc;
        // Raices
        double x1, x2;

        // Ingreso de datos
        System.out.println("Ingrese los coeficientes de la ecuación cuadrática:");
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();

        // Mostrar la ecuación cuadrática
        System.out.println("");
        System.out.println("f(x) = " + a + "x**2 + " + b + "x + " + c);

        // Calcular el discriminante
        disc = ((b*b) - (4*a*c));

        // Mostrar el resultado del calculo de raices si corresponde
        if (disc >= 0) {
            System.out.println("El valor del discriminante es: " + disc);

            x1 = (-b + Math.sqrt(disc)) / (2*a);
            x2 = (-b - Math.sqrt(disc)) / (2*a);

            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("La función no tiene soluciones reales");
        }
	}
}
