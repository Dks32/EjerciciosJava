import java.util.Scanner;


/*
 *  Crear una aplicación que solicite al usuario una fecha (día, mes y año) y
 *  muestre la fecha correspondiente al día siguiente.
 */


public class r14 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int diaa, mesa, ania; // Fecha actual
		int dian, mesn, anin; // Fecha nueva
		boolean fc; //Fecha válida

		// Ingreso de fecha
		System.out.println("Ingrese una fecha: ");
		System.out.print("Dia: ");
		diaa = scan.nextInt();
		System.out.print("Mes: ");
		mesa = scan.nextInt();
		System.out.print("Año: ");
		ania = scan.nextInt();

		// Validación de la fecha
		fc = (diaa > 0) && (mesa > 0); //Verificar que los números sean positivos
		fc = fc && (mesa <= 12); //Verificar si los meses están en un rango correcto

		switch (mesa) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				// 31 días
				fc = fc && (diaa <= 31);
				break;
			case 2:
				// 28 días
				fc = fc && (diaa <= 28);
				break;
			default:
				// 30 días
				fc = fc && (diaa <= 30);
				break;
		}

		// Calcular dia siguiente
		if (fc) {
			// Fecha válida
			dian = diaa + 1; // Sumar un día a la fecha
			mesn = mesa;
			anin = ania;

			int aux; // Auxiliar con los días que le corresponden al mes
			switch (mesa) {
				case 2:
					aux = 28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					aux = 30;
					break;
				default:
					aux = 31;
					break;
			}

			// Paso de mes
			if (dian > aux) {
				dian = 1;
				mesn += 1;
			}

			// Paso de año
			if (mesn > 12) {
				mesn = 1;
				anin += 1;
			}

			System.out.println("Fecha actual [" + ania + "/" + mesa + "/" + diaa + "] -> Fecha actual + 1 dia [" + anin + "/" + mesn + "/" + dian + "]");

		} else {
			// Fecha no válida
			System.out.println("La fecha ingresada no es válida");
		}
	}
}
