import java.util.Scanner;


/*
 *  Pedir al usuario su edad y mostrar la que tendrá el próximo año
 */


public class r02 {
	public static void main(String args[]) {
		int edad;
		Scanner scan = new Scanner(System.in);

		System.out.print("¿Cual es su edad?: ");
		edad = scan.nextInt();

		edad++; // Incrementa la edad en 1

		System.out.println("Su edad, el proximo año, será: " + edad);
	}
}
