import java.util.Scanner;


/*
 *  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta
 *  Recordamos que existen meses con 28, 30 y 31 días. No consideramos los
 *  años bisiestos.
 */


public class r12 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int dia, mes, anio;
		boolean fc = true; // si la Fecha es Correcta

		System.out.println("Ingrese una fecha: ");
		System.out.print("Día: ");
		dia = scan.nextInt();
		System.out.print("Mes: ");
		mes = scan.nextInt();
		System.out.print("Año: ");
		anio = scan.nextInt();

		// Verificar que los números sean positivos
		fc = (dia > 0) && (mes > 0);
		// Verificar si los meses están en un rango correcto
		fc = fc && (mes <= 12);

		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				// 31 días
				fc = fc && (dia <= 31);
				break;
			case 2:
				// 28 días
				fc = fc && (dia <= 28);
				break;
			default:
				// 30 días
				fc = fc && (dia <= 30);
				break;
		}

		if (fc) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha no es ccorrecta");
		}
	}
}
