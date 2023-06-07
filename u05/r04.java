import java.util.Scanner;


/*
 *  Implementar un programa que inicialice una tabla con nuestros números
 *  favoritos. A continuación, pedir al usuario el índice de un elemento que
 *  será eliminado de la tabla. Continuaremos eliminando elementos hasta que
 *  el índice introducido sea negativo o hasta que no existan más elementos
 *  que borrar. Es imprescindible controlar que el índice leído corresponde a
 *  un dato válido.
 */


public class r04 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nFav[] = {0, 1, 3, 7, 9, 12, 27, 42}; // Inicializar tabla de números
		int cElem = nFav.length;
		int elem;

		// Bucle para seleccionar elementos y eliminarlos
		while (cElem > 0) {
			// Mostrar elementos disponibles y solicitar uno para eliminar
			mostrarTabla(nFav, cElem);
			System.out.print("Elemento a eliminar: ");
			elem = scan.nextInt();

			// Eliminar el elemento seleccionado
			cElem = eliminarElemento(nFav, elem, cElem);

			// salir del while si elem < 0
			if (elem < 0) break;
		}
	}


	static int eliminarElemento(int nums[], int n, int ce) {
		/*
		 *  Función que elimina el elemnto n de nums[] y devuelve la cantidad
		 *  de elementos restantes en la lista
		 */

		// Verificar si n está en un rango correcto
		if (n >= 0 && n < ce) {
			// Desplazar elementos desde n hasta el final de la lista de elementos
			// para quitar el elemento elegido.
			// Si el elemento elegido es el último el bucle no se ejecuta.
			while (n < (ce - 1)) {
				nums[n] = nums[n + 1];
				n++;
			}
			ce--; // cantidad de elementos ha disminuido
		}

		// Devolver el nuevo valor de ce
		return(ce);
	}


	static void mostrarTabla(int nums[], int n) {
		/*
		 *  Función que muestra los números en una lista (nums[]) teniendo en
		 *  cuenta una cantidad de elementos n
		 */

		for (int i=0; i<n; i++) System.out.print(nums[i] + " ");
		System.out.println(); // Salto de línea al final de la lista
	}
}
