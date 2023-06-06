import java.util.Scanner;


/*
 *  Introducir por teclado un número n; a continuación solicitar al usuario
 *  que teclee n números. Realizar la media de los números positivos, la media
 *  de los negativos y contar el número de ceros introducidos.
 */


public class r03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n, ni, cceros = 0, mpos = 0, mneg = 0;

		System.out.print("Cuantos números?: ");
		n = scan.nextInt();

		// ciclo para introducir n números
		for (int i=0; i<n; i++) {
			System.out.print("[" + (i + 1) + "] Ingrese un número: ");
			ni = scan.nextInt();

			cceros += ni == 0 ? 1: 0;
			if (ni > 0) {
				mpos = mpos == 0 ? ni : (mpos + ni) / 2;
			} else if (ni < 0) {
				mneg = mneg == 0 ? ni : (mneg + ni) / 2;
			}
		}

		System.out.println("Ceros = " + cceros);
		System.out.println("Media Positivos = " + mpos);
		System.out.println("Media Negativos = " + mneg);

	}
}
