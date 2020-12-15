package cadenasTexto.ejerciciosB;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cad1;
		String cad2;
		System.out.println("Introduce cadena 1: ");
		cad1 = sc.nextLine();
		System.out.println("Introduce cadena 2: ");
		cad2 = sc.nextLine();

		if (cad1.equalsIgnoreCase(cad2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}

}
