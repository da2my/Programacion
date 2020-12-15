package cadenasTexto.ejerciciosB;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre;
		String apell1;
		String apell2;
		System.out.println("Introduce nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce 1º apellido: ");
		apell1 = sc.nextLine();
		System.out.println("Introduce 2º segundo: ");
		apell2 = sc.nextLine();

		System.out.print(nombre.toUpperCase().substring(0, 3));
		System.out.print(apell1.toUpperCase().substring(0, 3));
		System.out.print(apell2.toUpperCase().substring(0, 3));

//		for (int i = 0; i < 3; i++) {
//			System.out.print(nombre.charAt(i));
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.print(apell1.charAt(i));
//		}
//		for (int i = 0; i < 3; i++) {
//			System.out.print(apell2.charAt(i));
//		}

	}

}
