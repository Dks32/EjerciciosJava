import java.util.Scanner;


/*
 *  Desarrollar un programa que solicite los valores mínimo y máximo de un
 *  rango. A continuación solicitará por teclado un número que debe estar
 *  dentro del rango. Si el valor introducido no pertenece al rango, la
 *  aplicación volverá a pedir otro valor, y así repetidas veces, hasta que el
 *  valor se encuentre dentro del rango.
 */


public class r05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int min, max, num;

		System.out.println("Ingrese un rango de valores (mínimo y máximo):");
		System.out.print(" > ");
		min = scan.nextInt();
		System.out.print(" > ");
		max = scan.nextInt();

		// Intercambiar minimo y maximo si no están ordenados
		if (min > max) {
			int aux; //utilizar una variable auxiliar para hacer el intercambio
			aux = min;
			min = max;
			max = aux;
		}

		do {
			System.out.print("Ingrese un número:");
			num = scan.nextInt();
		} while ((num < min) || (num > max)); //Repetir mientras num > max o < min
	}
}
