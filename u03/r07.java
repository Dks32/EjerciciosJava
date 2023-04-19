/*
 *  Diseñar un programa que muestre el producto de los 10 primeros números
 *  impares.
 */

public class r07 {
	public static void main(String args[]) {
		int producto = 1;

		for (int i = 1; i <= 20; i += 2) {
			producto = producto * i;
		}

		System.out.println(producto);
	}
}
