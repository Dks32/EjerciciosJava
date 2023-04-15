import java.util.Scanner;


/*
 *  Pedir tres números y mostrarlos ordenados de mayor a menor.
 */


public class r07 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("Ingrese 3 números para ordenar");
		System.out.print("Ingrese el primer número: ");
		num1 = scan.nextInt();
		System.out.print("Ingrese el segundo número: ");
		num2 = scan.nextInt();
		System.out.print("Ingrese el tercer número: ");
		num3 = scan.nextInt();

		if (num1 >= num2) {
			if (num1 > num3) {
				if (num2 > num3) {
					System.out.println(num1 + " | " + num2 + " | " + num3);
				} else {
					System.out.println(num1 + " | " + num3 + " | " + num2);
				}
			} else {
				System.out.println(num3 + " | " + num1 + " | " + num2);
			}
		} else {
			if (num2 >= num3) {
				if (num1 >= num3) {
					System.out.println(num2 + " | " + num1 + " | " + num3);
				} else {
					System.out.println(num2 + " | " + num3 + " | " + num1);
				}
			} else {
				System.out.println(num3 + " | " + num2 + " | " + num1);
			}
		}
	}
}
