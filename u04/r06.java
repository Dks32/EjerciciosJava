import java.util.Scanner;


/*
 *  Crear una función que, mediante un booleano, indique si el carácter que se
 *  pasa como parámetro de entrada corresponde con una vocal.
 */


public class r06 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		char c; // Variable para almacenar el caracter introducido

		System.out.print("Ingrese un caracter: ");
		c = scan.next().charAt(0);  //se obtiene el primer carácter del String introducido por teclado

		// Mostrar un mensaje según el resultado de la función esVocal
		if (esVocal(c)) {
			System.out.println(" - El caracter " + c + " es vocal.");
		} else {
			System.out.println(" - El caracter " + c + " no es vocal.");
		}
	}

	static boolean esVocal(char c) {
		// Declaramos la variable del resultado que por defecto tiene un valor false
		boolean resultado = false;

		// Verificamos que el valor de c esté en la lista de vocales
		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				resultado = true;
		}

		// Devolvemos el resultado
		return resultado;
	}
}
