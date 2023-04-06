import java.util.Scanner;


/*
 *  Escribir una aplicación que pida el año actual y el de naciemiento del
 *  usuario. Debe calcular su edad, suponiendo que en el año en curso ya ha
 *  cumplido años.
 */


public class r0103 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

        int anac, edad;

        System.out.print("Ingrese el año de su naciemiento: ");
        anac = scan.nextInt();

        // Suponiendo que el año actual es 2023 y que el usuario ya cumplió años
        edad = 2023 - anac;

        System.out.println("Tu edad es de " + edad);
        System.out.println("(suponiendo que ya cumpliste años en el año en curso)");
	}
}
