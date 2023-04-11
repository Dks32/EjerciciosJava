import java.util.Scanner;


/*
 *  Sabiendo que para calcular la letra de un documento nacional de identidad
 *  el algoritmo es el siguiente:
 *   - Obtener el módulo 23 del número del DNI
 *   - Según el módulo obtenido y la siguiente tabla, se asigna la letra
 *     correspondiente al DNI:
 *        0    1    2    3    4    5    6    7    8    9   10   11
 *        T    R    W    A    G    M    Y    F    P    D    X    B
 *
 *          12   13   14   15   16   17   18   19   20   21   22
 *           N    J    Z    S    Q    V    H    L    C    K    E
 *
 *  Diseñar una aplicación en la que, dado un número de DNI, calcule la letra
 *  que le corresponde.
 */


public class e01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int dni;
		char letra = '-';

		System.out.print("Ingrese DNI: ");
		dni = scan.nextInt();

		switch (dni % 23) {
		case 0:
			letra = 'T';
			break;
		case 1:
			letra = 'R';
			break;
		case 2:
			letra = 'W';
			break;
		case 3:
			letra = 'A';
			break;
		case 4:
			letra = 'G';
			break;
		case 5:
			letra = 'M';
			break;
		case 6:
			letra = 'Y';
			break;
		case 7:
			letra = 'F';
			break;
		case 8:
			letra = 'P';
			break;
		case 9:
			letra = 'D';
			break;
		case 10:
			letra = 'X';
			break;
		case 11:
			letra = 'B';
			break;
		case 12:
			letra = 'N';
			break;
		case 13:
			letra = 'J';
			break;
		case 14:
			letra = 'Z';
			break;
		case 15:
			letra = 'S';
			break;
		case 16:
			letra = 'Q';
			break;
		case 17:
			letra = 'V';
			break;
		case 18:
			letra = 'H';
			break;
		case 19:
			letra = 'L';
			break;
		case 20:
			letra = 'C';
			break;
		case 21:
			letra = 'K';
			break;
		case 22:
			letra = 'E';
			break;
		}

		System.out.println(dni + "-" + letra);
	}
}
