import java.util.Scanner;


/*
 *  Diseñar una aplicación que solicite al usuario que introduzca una cantidad
 *  de segundos. La aplicación debe mostrar cuántas horas, minutos y segundos
 *  hay en el número de segundos introducidos por el usuario.
 */


public class e06 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int ts, tm, th, is;

		System.out.print("Ingrese una cantidad de segundos: ");
		is = scan.nextInt();

		ts = is % 60;
		th = is / 60 / 60;
		tm = (is / 60) % 60;

		System.out.println(th + ":" + tm + ":" + ts);
	}
}
