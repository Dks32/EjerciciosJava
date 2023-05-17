import java.util.Scanner;


/*
 *  Diseñar una aplicación que dibuje el triángulo de Pascal, para n filas.
 *  Numerando las filas y los elementos desde 0, la fórmula para obtener el
 *  m-ésimo elemento de la n-ésima fila es:
 *
 *    E(n, m) = n! / (m! (n-m)!)
 *
 *  donde n! es el factorial de n.
 *  Un ejemplo de triángulo de Pascal con 5 filas (n=4)
 *    1
 *    1 1
 *    1 2 1
 *    1 3 3 1
 *    1 4 6 4 1
 */


public class e05 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int nf; // Valor n final (numero de filas - 1)

		System.out.println("Triangulo de Pascal");
		System.out.print("Filas del tirangulo:");
		nf = scan.nextInt() - 1;

		for (int n=0; n<=nf; n++) { // Ciclo para las columnas
			for (int m=0; m<=n; m++) { // Ciclo para las columnas

				// Calculalr valor n!
				long fn = 1;
				for (int cfn=1; cfn<=n; cfn++) fn *= cfn;

				// Calculalr valor m!
				long fm = 1;
				for (int cfm=1; cfm<=m; cfm++) fm *= cfm;

				// Calculalr valor (n-m)!
				long fnm = 1;
				for (int cfnm=1; cfnm<=(n-m); cfnm++) fnm *= cfnm;

				// Aplicar formula para calcular el elemento
				long ne = fn / (fm * fnm);

				System.out.print(ne + " "); // Imprimir el numero e y un espacio
			}
			System.out.println(); // Salto de linea
		}

		/*
		 *  Nota: Incluso utilizando variables de tipo long para los factoriales
		 *  hay un desbordamiento cuando n>21
		 */
	}
}
