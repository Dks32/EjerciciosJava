import java.util.Scanner;


/*
 *  Idear un programa que solicite al usuario un número comprendido entre 1 y
 *  7, correspondiente a un día de la semana. Se debe mostrar el nombre del
 *  día de la semana al que corresponde. Por ejemplo, el número 1 corresponde
 *  a «lunes» y el 6 a «sábado»
 */


public class r15 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int diaNum;

		System.out.print("Ingrese un día (1-7): ");
		diaNum = scan.nextInt();

		switch (diaNum) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Día no válido");
		}
	}
}
