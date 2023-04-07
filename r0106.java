import java.util.Scanner;


/*
 *  Modificar el ejercicio anterior para que muestre la parte entera de la media
 *  de tres notas decimales.
 */


public class r0106 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int nota1, nota2, nota3;
		int prom;

		System.out.print("Ingrese la primera nota: ");
		nota1 = scan.nextInt();
		System.out.print("Ingrese la segunda nota: ");
		nota2 = scan.nextInt();
		System.out.print("Ingrese la tercera nota: ");
		nota3 = scan.nextInt();

		prom = ((nota1 + nota2 + nota3) / 3);

		System.out.println("El promedio es: " + prom);
	}
}