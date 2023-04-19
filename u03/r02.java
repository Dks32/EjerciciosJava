import java.util.Scanner;

/*
 *  Un centro educativo nos ha pedido que diseñemos una aplicación para
 *  calcular algunos datos estadísticos de las edades de los alumnos. Se
 *  introducirán datos hasta que uno de ellas sea negativo. La aplicación
 *  mostrará la suma de todas las edades, la media, de cuántos alumnos hemos
 *  introducido las edades y cuántos alumnos son mayores de edad.
 */

public class r02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int edad, sumEdades = 0, numAlumnos = 0, numMayores = 0;
		double mediaEdades;

		// Bucle infinito (la salida se hará con un break con un número negativo)
		while (true) {
			// Ingresar datos
			System.out.print("Ingrese edad del alumno (negativo para salir): ");
			edad = scan.nextInt();

			// salir si el número es negativo
			if (edad < 0) {break;} 

			numAlumnos++; // Incrementar la cantidad de alumnos
			sumEdades += edad; // Sumar las edades
			if (edad >= 18) {numMayores++;} // Incrementar numMayores
		}

		mediaEdades = (double) sumEdades / numAlumnos; // Calcular la media de las edades

		System.out.println(" - Cantidad de alumnos: " + numAlumnos);
		System.out.println(" - Alumnos mayores    : " + numMayores);
		System.out.println(" - Suma de edades     : " + sumEdades);
		System.out.println(" - Media de las edades: " + mediaEdades);
	}
}
