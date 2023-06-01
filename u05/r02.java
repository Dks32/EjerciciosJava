import java.util.Scanner;


/*
 *  Escribir una aplicación que solicite al usuario cuántos números desea
 *  introducir. A continuacionm se introducirá por teclado esa cantidad de
 *  números enteros, y por último, los mostrará en el orden inverso al
 *  introducido.
 */


public class r02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int cnum, nums[];

		System.out.print("¿Cuantos números desea ingresar?");
		cnum = scan.nextInt();

		nums = new int[cnum];

		for (int i=0; i<cnum; i++) {
			System.out.print("Ingrese un número: ");
			nums[i] = scan.nextInt();
		}

		for (int i=1; i<=cnum; i++) {
			System.out.println(nums[nums.length - i]);
		}
	}
}
