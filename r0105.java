import java.util.Scanner;


/*
 *  Necesitamos una aplicación que calcule la media aritmética de dos notas
 *  enteras. Hay que tener en cuenta que la media puede contener decimales.
 */


public class r0105 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int nota1, nota2;
		float prom;

		System.out.print("Ingrese la primera nota: ");
		nota1 = scan.nextInt();
		System.out.print("Ingrese la segunda nota: ");
		nota2 = scan.nextInt();

		prom = (float) ((nota1 + nota2) / 2.0);

		System.out.println("El promedio es: " + prom);
	}
}