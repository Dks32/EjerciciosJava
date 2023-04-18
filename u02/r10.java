import java.util.Scanner;


/*
 *  Pedir un número entre 0 y 9.999 y decir si es capicúa.
 */


public class r10 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, cifras, d1, d2; //d1 y d2 serán digitos a comparar
		boolean es_capicua = false;

		System.out.print("Ingrese un número (0-9999): ");
		num = scan.nextInt();

		// Utilizo el operador ternario para conocer las cifras del número
		cifras = 1;
		cifras = (num >= 10) ? 2: cifras;
		cifras = (num >= 100) ? 3: cifras;
		cifras = (num >= 1000) ? 4: cifras;
		cifras = (num >= 10000) ? -1: cifras; // Fuera del rango solicitado (4 cifras)

		System.out.println("Cifras: " + cifras);
		switch (cifras) {
			case 1:
				// Considero que todos los números de una cifra son capicuas
				es_capicua = true;
				break;
			case 2:
				// Obtener los dós únicos dígitos del número
				d1 = num % 10;
				d2 = (num / 10) % 10;
				// Compararlos para verificar si el número es capicua
				es_capicua = (d1 == d2);
				break;
			case 3:
				// Obtener el primer y último dígito. El dígito central no importa
				d1 = num % 10;
				d2 = (num / 100) % 10;
				// Compararlos para verificar si el número es capicua
				es_capicua = (d1 == d2);
				break;
			case 4:
				// Obtener los digitos de los extremos
				d1 = num % 10;
				d2 = (num / 1000) % 10;
				// Comparar los digitos de los extremos
				es_capicua = (d1 == d2);

				// Obtener los digitos centrales
				d1 = (num / 10) % 10;
				d2 = (num / 100) % 10;
				// Comparar los digitos centrales y el valor anterior de es_capicua
				es_capicua = (es_capicua && (d1 == d2));
				break;
		}

		if (cifras == -1) {
			System.out.println("Número fuera del rango admitido.");
		} else {
			// Utilizo el operador ternario para modificar la cadena resultante entre si "es" o "no es" un número capicua
			System.out.println("El número " + num + (es_capicua ? " es " : " no es ") + "capicua.");
		}
	}
}
