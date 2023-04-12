import java.util.Scanner;


/*
 *  En una geranja se compra diariamente una cantidad (comidaDiaria) de comida
 *  para los animales. El núemro de animales a alimentar (todos de la misma
 *  especie) es numAnimales, y sabemos que cada animal come una medida de 
 *  kilosPorAnimal.
 *  Diseñar un programa que solicite al usuario los valores anteriores y
 *  determine si disponemos de alimento suficiente para cada animal. En caso
 *  negativo, ha de calcular cuál es la ración que corresponde a cada uno de los
 *  animales.
 *  Nota: Evitar que la aplicación realice divisiones por cero.
 */


public class e02 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		Double comidaDiaria, kilosPorAnimal, racion;
		int numAnimales;

		System.out.print("Ingrese la cantidad de comidaDiaria (kg): ");
		comidaDiaria = scan.nextDouble();
		System.out.print("Numero de animales: ");
		numAnimales = scan.nextInt();
		System.out.print("Kilos por animal: ");
		kilosPorAnimal = scan.nextDouble();

		if (numAnimales == 0) {
			System.out.println("La cantidad de animales no puede ser 0");
		} else {
			racion = comidaDiaria / numAnimales;
			if (racion >= kilosPorAnimal) {
				System.out.println("Ración Suficiente.");
			} else {
				System.out.println("Ración Insuficiente:\nSolo se dispone de " + racion + "kg por cada animal.");
			}
		}
	}
}
