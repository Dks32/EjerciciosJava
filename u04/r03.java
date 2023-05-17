import java.util.Scanner;


/*
 *  Realizar una función que calcule y muestre el área o el volumen de un
 *  cilindro, según se especifique. Para distinguir un caso de otro se le
 *  pasará un número 1 (para área) o 2 (para el volumen). Además, hemos de
 *  pasarle a la función el radio de la base y la altura.
 *    area = 2 * pi * radio * (altura + radio)
 *    volumen = pi * radio * radio * altura
 */


public class r03 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int calc, radio, altura;

		System.out.println("Ingrese los datos del cilindro: ");
		System.out.print("Radio: ");
		radio = scan.nextInt();
		System.out.print("Altura: ");
		altura = scan.nextInt();

		System.out.println("Tipo de calculo?");
		System.out.println("1. Area");
		System.out.println("2. Volumen");
		System.out.print(":");
		calc = scan.nextInt();

		calculoCilindro(calc, radio, altura);
	}


	static void calculoCilindro(int tipocalculo, int radio, int altura) {
		double result;

		switch (tipocalculo) {
			case 1:
				// Calculo area
				result = 2 * Math.PI * radio * (altura + radio);
				System.out.println("El area del cilindro es: " + result);
				break;
			case 2:
				// Calculo volumen
				result = Math.PI * radio * radio * altura;
				System.out.println("El volumen del cilindro es: " + result);
				break;
			default:
				// Error
				System.out.println("Tipo de calculo erroneo");
		}
	}
}
