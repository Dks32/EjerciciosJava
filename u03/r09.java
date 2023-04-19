import java.util.Scanner;


/*
 *  Un centro de investigación de la flora urbana necesita una aplicación que
 *  muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
 *  altura (en centímetros) de cada árbol (terminando cuando se utilice -1
 *  como altura). Los árboles se identifican mediante etiquetas con números
 *  únicos correlativos, comenzanddo en 0. Se pide diseñar una aplicación que
 *  resuelva el problema planteado.
 */


public class r09 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int i = 0, altura = 0, max = 0, maxi=-1;

		do {
			// Ingresar altura del arbol
			System.out.print("[" + i + "] Altura del arbol en cm (-1 para salir): ");
			altura = scan.nextInt();

			if (altura > max) {
				max = altura;
				maxi = i;
			}
			i++;
		} while (altura != -1);

		System.out.println("Arbol más alto: No." + maxi + " (" + max + "cm)");
	}
}
