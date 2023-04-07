import java.util.Scanner;
import java.util.Locale;

/*
 *  Un frutero necesita calcular los beneficios anuales que obtiene de la venta
 *  de manzanas y peras. Por este motivo, es necesario diseñar una aplicación
 *  que solicite las ventas (en kilos) de cada trimestre para cada fruta. La
 *  aplicación mostrará el importe total sabiendo que el precio del kilo de
 *  manzanas está fijado en 2.35 euros y el kilo de peras está fijado en 1.95
 *  euros.
 */


public class r0108 {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        float mz1, mz2, mz3, mz4; // Venta manzanas por trimestre
        float pe1, pe2, pe3, pe4; // Venta peras por trimestre
        float pmz = 2.35f; // Precio fijado para las manzanas por kilo
        float ppe = 1.95f; // Precio fijado para las peras por kilo
        float tmz, tpe; // Beneficio bruto manzanas y peras

        System.out.println("pmz=" + pmz + " ppe=" + ppe);

        System.out.println("\nVentas de MANZANAS por cuatrimestre (kilos):");
        System.out.print(" * 1° Trimestre: ");
        mz1 = scan.nextFloat();
        System.out.print(" * 2° Trimestre: ");
        mz2 = scan.nextFloat();
        System.out.print(" * 3° Trimestre: ");
        mz3 = scan.nextFloat();
        System.out.print(" * 4° Trimestre: ");
        mz4 = scan.nextFloat();

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