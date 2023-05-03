import java.util.Scanner;


/*
 *  Escribir un programa que incremente la hora de un reloj. Se pedirán por
 *  teclado la hora, los minutos y segundos, así como cuántos segundos se
 *  desea incrementar la hora introducida. La aplicación mostrará la nueva
 *  hora. Por ejemplo si las 13:59:51 se incrementan en 10 segundos resultan
 *  las 14:00:01.
 */


public class e02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int hor, min, seg, inc, aux;

		// Ingresar hora
		System.out.print("Ingrese hora: ");
		hor = scan.nextInt();
		System.out.print("Ingrese minutos: ");
		min = scan.nextInt();
		System.out.print("Ingrese segundos: ");
		seg = scan.nextInt();

		// Ingresar Incremento
		System.out.print("\nIngrese el incremento: ");
		inc = scan.nextInt();

		// Calculos de incremento
		seg = seg + inc; // Incrementa segundos
		inc = seg / 60;  // Calcular el incremento para los minutos
		seg = seg % 60;  // Ajustar los segundos para que no superen los 60

		min = min + inc; // Incrementa minutos
		inc = min / 60;  // Calcular el incremento para las horas
		min = min % 60;  // Ajustar los minutos para que no superen los 60

		hor = hor + inc; // Incrementar horas
		hor = hor % 24;  // Suponiendo un reloj de 24hs

		System.out.println(hor + ":" + min + ":" + seg);
	}
}
