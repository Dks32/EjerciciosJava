import java.util.Scanner;


/*
 *  Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
 *  denota 5! y es igual a 5x4x3x2x1 = 20
 */


public class r08 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, fact = 1;

		System.out.print("Ingrese un número para calcular su factorial: ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			fact *= i;
		}

		System.out.println(num + "! = " + fact);
	}
}
