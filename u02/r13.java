import java.util.Scanner;


/*
 *  Escribir un programa que pida una hora de la forma: hora, minutos y
 *  segundos. El programa debe mostrar la hora un segundo más tarde. Un
 *  ejemplo:
 *
 *    hora actual [10:41:59] -> hora actual + 1 segundo [10:42:00]
 */


public class r13 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int hora, mina, sega;
        int horn, minn, segn;
        boolean hval; // Hora valida

        System.out.print("Hora: ");
        hora = scan.nextInt();
        System.out.print("Minutos: ");
        mina = scan.nextInt();
        System.out.print("Segundos: ");
        sega = scan.nextInt();

        // Validar la hora ingresada
        hval = (hora >= 0) && (mina >= 0) && (sega >= 0); //Verifica todos los datos positivos
        hval = hval && (hora <= 23); // Verifica que hora no sea superior a 23
        hval = hval && (mina <= 59); // Verifica que minutos no sea superior a 60
        hval = hval && (sega <= 59); // Verifica que segundos no sea superior a 60

        if (hval) {
            segn = sega + 1;
            minn = mina;
            horn = hora;

            // Cambio de minuto
            if (segn > 59) {
                segn = 0;
                minn = mina + 1;
            }

            // Cambio de hora
            if (minn > 59) {
                minn = 0;
                horn = horn + 1;
            }

            // Cambio de día
            if (horn > 23) {
                horn = 0;
            }

            System.out.println("Hora actual [" + hora + ":" + mina + ":" + sega + "] -> hora actual + 1 segundo [" + horn + ":" + minn + ":" + segn + "]");
        } else {
            System.out.println("Hora no válida.");
        }
	}
}
