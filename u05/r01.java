import java.util.Scanner;


/*
 *  Diseñar un programa que solicite al usuario que introduzca por teclado 5
 *  números a continuación, debe mostrar los números en el mismo orden que se
 *  han introducido.
 */


public class r01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nums[] = new int[5];

		for (int i=0; i<nums.length; i++) {
			System.out.print("Ingrese un número: ");
			nums[i] = scan.nextInt();
		}

		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
