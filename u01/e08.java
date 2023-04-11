import java.util.Scanner;


/*
 *  Un biólogo está realizando un estudio de distintas especies de
 *  invertebrados y necesita una aplicación que le ayude a contabilizar el
 *  número de patas que tienen en total todos los animales capturados durante
 *  una jornada de trabajo. Para ello, nos ha solicitado que escribamos una
 *  aplicación a la que hay que proporcionar:
 *   - El número de hormigas capturadas (6 patas)
 *   - El número de arañas capturadas (8 patas)
 *   - El número de cochinillas capturadas (14 patas)
 *  La aplicación debe mostrar el número total de patas que poseen todos los
 *  animales.
 */


public class e08 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

        int hormigas, aranias, cochinillas, hpatas, apatas, cpatas, tpatas;

        System.out.print("Ingrese cantidad de hormigas: ");
        hormigas = scan.nextInt();
        System.out.print("Ingrese cantidad de arañas: ");
        aranias = scan.nextInt();
        System.out.print("Ingrese cantidad de cochinillas: ");
        cochinillas = scan.nextInt();

        hpatas = hormigas * 6;
        apatas = aranias * 8;
        cpatas = cochinillas * 14;
        tpatas = hpatas + apatas + cpatas;

        System.out.println();
        System.out.println("Patas de hormigas   : " + hpatas);
        System.out.println("Patas de arañas     : " + apatas);
        System.out.println("Patas de cochinillas: " + cpatas);
        System.out.println();
        System.out.println("Total de patas      : " + tpatas);

	}
}
