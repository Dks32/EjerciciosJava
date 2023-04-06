import java.util.Scanner;


/*
 *  El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
 *  Se pide escribir un programa que compruebe que el rango de valores de un
 *  tipo se comporta de forma cíclica, es decir, el valor siguiente al máximo es
 *  el valor mínimo y viceversa.
 */


public class r0104 {
	public static void main(String args[]) {
		short max =  32767;
        short min = -32768;

        System.out.print("max = " + max);
        max++;
        System.out.println(" + 1 = " + max);

        System.out.print("min = " + min);
        min--;
        System.out.println(" - 1 = " + min);
	}
}
