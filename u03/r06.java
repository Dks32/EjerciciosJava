import java.util.Scanner;


/*
 *  Escribir todos los múltiplos de 7 menores que 100
 */


public class r06 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		for (int i = 7; i < 100; i += 7) {
			System.out.println(i);
		}
	}
}
