import java.util.Scanner;


/*
 *  Realizar el juego «el numero secreto», que consiste en acertar un número
 *  desconocido (generado aleatoriamente entre 1 y 100). Para ello se leen por
 *  teclado una serie de números, para los que se indica: «mayor» o «menor»,
 *  según sea mayor o menor con respecto al número secreto. El proceso termina
 *  cuando el usuario acierta o cuando se rinde (introduciendo un -1)
 */


public class r03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int numSecreto = (int) (Math.random() * 100 + 1); //número aleatorio entre 1 y 100
		int num = 0; // Inicializamos con 0 por que no puede ser el número secreto

		while (num != numSecreto) {
			System.out.print("Adivine el número secreto (-1 para salir): ");
			num = scan.nextInt();

			if (num == -1) {break;} // Salir si num = -1

			if (num > numSecreto) {
				// Si el número elegido es mayor al secreto
				System.out.println(" - Mayor");
			} else if (num < numSecreto) {
				// Si el número elegido es menor al secreto
				System.out.println(" - Menor");
			} else {
				// Si el número elegido es igual al secreto
				System.out.println(" - Adivinaste");
			}
			System.out.println();
		}
	}
}
