import java.util.Scanner;


/*
 *  Desarrolar el juego *la camara secreta*, que consiste en abrir una cámara
 *  mediante su combinación secreta, que está formada por una combinación de
 *  dígitos del uno al cinco. El jugador especificará cuál es la longitud de
 *  la combinación, a mayor longitud, mayor será la dificultad del juego. La
 *  aplicación genera, de forma aleatoria, una combinación secreta que el
 *  usuario tendrá que acertar. En cada intento se muestra como pista, para
 *  cada dígito de la combinación introducido por el jugador, si es mayor,
 *  menor o igual que el correspondiente en la combinación secreta.
 */


public class r05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Longitud de la clave: ");
		int digitos = scan.nextInt();

		// Generar combinación secreta
		int comb[] = new int[digitos];
		for (int i=0; i<digitos; i++) {
			comb[i] = (int) ((Math.random() * 5) + 1);
		}

		int i = 0;
		int d;
		while (i<digitos) {
			System.out.print("Adivine el digito [" + (i + 1) + "/" + digitos + "]: ");
			d = scan.nextInt();

			if (d < 0) {break;} // Si se ingresa un número negativo salir del juego

			if (d < 1 || d > 5) {continue;} // si d fuera de rango saltar al siguiente ciclo

			if (d == comb[i]) {
				// si d se acierta se sigue con el siguiente digito
				System.out.println("Bien");
				i++;
				continue;
			}

			System.out.println((d > comb[i] ? "Mayor": "Menor"));
		}

		if (i==digitos) {
			System.out.println("La camara secreta fue abierta.");
		} else {
			System.out.println("Fallaste.");
		}
	}
}
