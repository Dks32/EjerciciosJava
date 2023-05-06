import java.util.Scanner;


/*
 *  Calcular la raíz cuadrada de un número natural mediante aproximaciones. En el caso de que no sea exacta, mostraremos el resto. Por ejemplo, para calcular raiz de 23, probamos 1**2 = 1, 2**2 = 4, 3** = 9, 4**2 = 16, 5**2 = 25 (nos pasamos) resultando 4 la raíz cuadrada de 23 con un resto (23 - 16) de 7.
 */


public class e04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num, pot, aux=0, res, i=0;

		System.out.print("Ingrese un número positivo: ");
		num = scan.nextInt();

		// Buscar raiz por fuerza bruta
		while (aux < num) {
			i++;
			aux = i * i;
		}

		// Si nos pasamos
		if (aux > num) {
			i--;
			aux = i * i;
		}

		// Calcular el resto
		res = num - aux;

		// Mostrar mensajes
		System.out.println("Raiz cuadrada de " + num + " = " + i);
		if (res != 0) {
			System.out.println("Con un resto de " + res);
		}
	}
}
