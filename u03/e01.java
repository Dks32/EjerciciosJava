import java.util.Scanner;


/*
 *  Implementar un programa que pida al usuario un número de tres cifras y lo
 *  muestre guarismo a guarismo. Por ejemplo, para el número 123, debe mostrar
 *  primero el 1, a continuación el 2 y por último el 3.
 */


public class e01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, gua, aux;

		// Solicitar un número de 3 dígitos
		System.out.print("Ingrese un número de 3 dígitos: ");
		num = scan.nextInt();

		aux = num;
		for (int i=1; i<=3; i++) {
			gua = (aux % 10);
			aux = (int) (aux / 10);
			System.out.println(gua);
		}
	}
}
