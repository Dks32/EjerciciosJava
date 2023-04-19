import java.util.Scanner;


/*
 *  Solicitar un número comprendido entre 1 y 99. El programa debe mostrarlo
 *  escrito. Por ejemplo, para 56 mostrar: «cincuenta y seis»
 */


public class r16 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, d1, d2;
		String numSt = "";

		// Solicitar un número entre 1 y 99
		System.out.print("Ingrese un número (1-99): ");
		num = scan.nextInt();

		// Averiguar los dígitos del número ingresado
		d1 = num % 10;
		d2 = (num / 10) % 10;

		// Elegir parte de la cadena según el dígito más significativo (decenas)
		switch (d2) {
			case 1:
				numSt = "dieci";
				break;
			case 2:
				numSt = "veinti";
				break;
			case 3:
				numSt = "treinta y ";
				break;
			case 4:
				numSt = "cuarenta y ";
				break;
			case 5:
				numSt = "cincuenta y ";
				break;
			case 6:
				numSt = "sesenta y ";
				break;
			case 7:
				numSt = "setenta y ";
				break;
			case 8:
				numSt = "ochenta y ";
				break;
			case 9:
				numSt = "noventa y ";
				break;
		}

		// Elegir parte de la cadena según el dígito menos significativo (unidades)
		switch (d1) {
			case 1:
				numSt = numSt + "uno";
				break;
			case 2:
				numSt = numSt + "dos";
				break;
			case 3:
				numSt = numSt + "tres";
				break;
			case 4:
				numSt = numSt + "cuatro";
				break;
			case 5:
				numSt = numSt + "cinco";
				break;
			case 6:
				numSt = numSt + "seis";
				break;
			case 7:
				numSt = numSt + "siete";
				break;
			case 8:
				numSt = numSt + "ocho";
				break;
			case 9:
				numSt = numSt + "nueve";
				break;
		}

		// Casos especiales
		switch (num) {
			case 10:
				numSt = "diez";
				break;
			case 11:
				numSt = "once";
				break;
			case 12:
				numSt = "doce";
				break;
			case 13:
				numSt = "trece";
				break;
			case 14:
				numSt = "catorce";
				break;
			case 15:
				numSt = "quince";
				break;
			case 20:
				numSt = "veinte";
				break;
			case 30:
				numSt = "treinta";
				break;
			case 40:
				numSt = "cuarenta";
				break;
			case 50:
				numSt = "cincuenta";
				break;
			case 60:
				numSt = "sesenta";
				break;
			case 70:
				numSt = "setenta";
				break;
			case 80:
				numSt = "ochenta";
				break;
			case 90:
				numSt = "noventa";
				break;
		}

		if ((num >= 1) && (num <= 99)) {
			// Si el número está en el rango
			System.out.println(numSt);
		} else {
			// Número fuera de rango
			System.out.println("Numero fuera de rango.");
		}
	}
}
