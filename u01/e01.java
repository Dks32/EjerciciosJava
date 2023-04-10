import java.util.Scanner;


/*
 *  Un economista nos ha encargado un programa para realizar cálculos con el
 *  IVA. La aplicación debe solicitar la base imponible y el IVA a aplicar.
 *  Debemos mostrar en pantalla el importe correspondiente al IVA y el total.
 */


public class e01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		double bi, iva, importe_iva, total;

		System.out.print("Ingrese la base imponible  : ");
		bi = scan.nextDouble();
		System.out.print("Ingrese el IVA (porcentaje): ");
		iva = scan.nextDouble();

		importe_iva = bi * iva / 100;
		total = bi + importe_iva;

		System.out.println("Importe IVA  : " + importe_iva);
		System.out.println("Total con IVA: " + total);
	}
}
