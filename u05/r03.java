import java.util.Scanner;


/*
 *  Introducir por teclado un número n; a continuación solicitar al usuario
 *  que teclee n números. Realizar la media de los números positivos, la media
 *  de los negativos y contar el número de ceros introducidos.
 */


public class r03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, // cantidad de números
			ni, // valor de números ingresados
			cceros = 0, // cantidad de ceros
			cpos = 0, // cantidad de positivos
			cneg = 0; // cantidad de negativos
		float mpos = 0, // suma y luego media de positivos
			  mneg = 0; // suma y luego media de negativos

		System.out.print("Cuantos números?: ");
		n = scan.nextInt();

		// Ciclo para introducir n números. Las medias y cantidad de ceros
		// se calcularán aquí también.
		for (int i=0; i<n; i++) {
			System.out.print("[" + (i + 1) + "] Ingrese un número: ");
			ni = scan.nextInt();

			// Si el número es 0
			cceros += ni == 0 ? 1: 0;

			// Si el número es positivo
			if (ni > 0) {
				cpos++; // cantidad de positivos + 1
				mpos += ni; // agregamos el numero a la suma de positivos

			// Si el número es negativo
			} else if (ni < 0) {
				cneg++;
				mneg += ni;
			}
		}

		mpos /= cpos;
		mneg /= cneg;

		// Mostramos por pantalla el resultado de las medias y sumas
		System.out.println("Ceros = " + cceros);
		System.out.println("Media Positivos = " + mpos);
		System.out.println("Media Negativos = " + mneg);
	}
}
