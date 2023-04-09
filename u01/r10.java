import java.util.Scanner;


/*
 *  Diseñar una aplicación que calcule la longitud y el área de una
 *  circunferencia. Para ello, el usuario debe introducir el radio (que puede
 *  contener decimales)
 *
 *  longitud = 2 * pi * radio
 *  area     = pi * radio^2
 */


public class r10 {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final float PI = 3.1416f;

        float longitud, area, radio;

        System.out.print("Radio de la circunferencia: ");
        radio = scan.nextFloat();

        area = PI * radio * radio;
        longitud = 2 * PI * radio;

        System.out.println("El área de la círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
	}
}