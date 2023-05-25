import java.util.Scanner;


/*
 *  Implementar la función
 *    static double distancia(double x1, double y1, double x2, double y2)
 *  que calcula y devuelve la distancia euclídea que separa los puntos
 *  (x1, y1) y (x2, y2).
 *  La fórmula para calcular esta distancia es:
 *    distancia = sqrt((x1-x2)^2 + (y1 - y2)^2)
 */


public class e03 {
	// Función para calcular distancia euclídea entre dos puntos
	static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}



	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int x1, x2, y1, y2;

		System.out.println("Calculo de distancia");
		System.out.print("x1?: ");
		x1 = scan.nextInt();
		System.out.print("y1?: ");
		y1 = scan.nextInt();
		System.out.print("x2?: ");
		x2 = scan.nextInt();
		System.out.print("y2?: ");
		y2 = scan.nextInt();

		System.out.println("p1:(" + x1 + ", " + y1 + ")");
		System.out.println("p2:(" + x2 + ", " + y2 + ")");
		System.out.println("Distancia entre p1 y p2 = " + distancia(x1, y1, x2, y2));
	}
}
