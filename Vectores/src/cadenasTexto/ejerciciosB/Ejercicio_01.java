package cadenasTexto.ejerciciosB;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadena de texto: ");
		String cadena = sc.nextLine();

		String[] arrSplit = cadena.split(" ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);
		}
	}
}
