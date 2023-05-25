import java.util.Scanner;


/*
 *  Diseñar una función que calcule la superficie y el volumen de una esfera.
 */


public class e01 {
	// Función para calcular la superficie y el volumen de una esfera
	static void esferaSupVol(int radio) {
		double sup, vol;

		sup = 4 * Math.PI * Math.pow(radio, 2);
		vol = (4 * Math.PI * Math.pow(radio, 3)) / 3;

		// La forma:
		//   vol = (4/3) * Math.PI * Math.pow(radio, 3);
		//   devuelve un resultado erroneo (aun no determino el por qué).

		System.out.println("Para una esfera cuyo radio es " + radio);
		System.out.println("Superficie = " + sup);
		System.out.println("Volumen    = " + vol);
	}



	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese el radio de una esfera: ");
		int radio = scan.nextInt();

		esferaSupVol(radio);
	}
}
