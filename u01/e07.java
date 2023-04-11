import java.util.Scanner;


/*
 *  Solicitar al usuario tres distancias:
 *   - La primera, medida en milímetros;
 *   - La segunda, medida en centímetros;
 *   - La última, medida en metros.
 *  Diseñar un programa que muestre la suma de las tres longitudes
 *  introducidas (medida en centímetros)
 */


public class e07 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int mm, cm, m;
        float tcm;

        System.out.print("Ingrese mm: ");
        mm = scan.nextInt();
        System.out.print("Ingrese cm: ");
        cm = scan.nextInt();
        System.out.print("Ingrese m : ");
        m = scan.nextInt();

        tcm = (float) (mm / 100.0) + cm + (m * 100);

        System.out.println("Total = " + tcm + "cm");
	}
}
