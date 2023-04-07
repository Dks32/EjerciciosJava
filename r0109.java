import java.util.Scanner;
import java.util.Locale;

/*
 *  Los precios de la fruta no suelen ser constantes; varían según el mercado.
 *  Se pide modificar el ejercicio anterior para que los precios no estén
 *  fijados y sea la aplicación quien los pida al usuario.
 */

public class r0109 {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        float mz1, mz2, mz3, mz4; // Venta manzanas por trimestre
        float pe1, pe2, pe3, pe4; // Venta peras por trimestre
        float pmz, ppe; // Precios de manzanas y peras
        float tmz, tpe; // Beneficio bruto manzanas y peras

        System.out.println("\nIngrese precio de las manzanas: ");
        pmz = scan.nextFloat();

        System.out.println("\nVentas de MANZANAS por cuatrimestre (kilos):");
        System.out.print(" * 1° Trimestre: ");
        mz1 = scan.nextFloat();
        System.out.print(" * 2° Trimestre: ");
        mz2 = scan.nextFloat();
        System.out.print(" * 3° Trimestre: ");
        mz3 = scan.nextFloat();
        System.out.print(" * 4° Trimestre: ");
        mz4 = scan.nextFloat();

        System.out.println("\nIngrese precio de las peras: ");
        ppe = scan.nextFloat();

        System.out.println("\nVentas de PERAS por cuatrimestre (kilos):");
        System.out.print(" * 1° Trimestre: ");
        pe1 = scan.nextFloat();
        System.out.print(" * 2° Trimestre: ");
        pe2 = scan.nextFloat();
        System.out.print(" * 3° Trimestre: ");
        pe3 = scan.nextFloat();
        System.out.print(" * 4° Trimestre: ");
        pe4 = scan.nextFloat();

        tmz = (mz1 + mz2 + mz3 + mz4) * pmz; // Calculo beneficio manzanas
        tpe = (pe1 + pe2 + pe3 + pe4) * ppe; // Calculo beneficio peras

        System.out.println("\nEl beneficio anual (bruto) es:");
        System.out.println(" * Manzanas: " + tmz);
        System.out.println(" * Peras   : " + tpe);
	}
}
