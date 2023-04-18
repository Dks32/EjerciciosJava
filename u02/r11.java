import java.util.Scanner;


/*
 *  Pedir una nota de 0 a 10 y mostrarla de la forma:
 *    Insuficiente (0 - 4)
 *    Suficiente (5)
 *    Bien (6)
 *    Notable (7 - 8)
 *    Sobresaliente (9 - 10)
 */


public class r11 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nota;
        String res;

        System.out.print("Ingrese nota (0-10): ");
        nota = scan.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                res = "Insuficiente";
                break;
            case 5:
                res = "Suficiente";
                break;
            case 6:
                res = "Bien";
                break;
            case 7:
            case 8:
                res = "Notable";
                break;
            case 9:
            case 10:
                res = "Sobresaliente";
                break;
            default:
                res = "Nota fuera del rango";
                break;
        }

        System.out.println(res);
	}
}
