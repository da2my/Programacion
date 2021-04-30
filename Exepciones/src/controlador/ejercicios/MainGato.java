package controlador.ejercicios;

import java.util.Scanner;

import modelo.ejercicios.ExceptionEntradaEdad;
import modelo.ejercicios.ExceptionEntradaNombre;
import modelo.ejercicios.Gato;

public class MainGato {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;
		boolean edadBucle = true;
		boolean nombreBucle = true;
		String siono;
//		Introduce nuevo gato
		do {

			try {
				System.out.println("Introduzca nombre, al menos 3 letras: ");
				String nom = sc.next();
				System.out.println("Introduzca edad, no debe ser negativa: ");
				int edad = sc.nextInt();
				Gato g1 = new Gato(nom, edad);
				bucle = false;
				System.out.println("\nCaracteristicas de " + g1.getNombre() + ":\n" + g1.toString() + "\n");

//				Cambiar nombre
				do {

					try {
						System.out.println("Quieres cambiar nombre (S/N):");
						siono = sc.next();
						if (siono.equalsIgnoreCase("S")) {
							System.out.println("Introduce nuevo nombre: ");
							g1.setNombre(sc.next());
						}
					} catch (ExceptionEntradaNombre e) {
						System.err.printf("\nExcepcion: %s\n", e);
						sc.nextLine();
						System.out.println("Debe introducir al menos 3 letras. Intente de nuevo.\n");
					}
					System.out.println("Seguir modificando nombre: (S/N):");
					siono = sc.next();
					if (siono.equalsIgnoreCase("N")) {
						nombreBucle = false;
					}
				} while (nombreBucle);

//				Cambiar edad
				do {
					try {
						System.out.println("Quieres cambiar edad (S/N):");
						siono = sc.next();
						if (siono.equalsIgnoreCase("S")) {
							System.out.println("Introduce nueva edad: ");
							g1.setEdad(sc.nextInt());
						}
					} catch (ExceptionEntradaEdad e) {
						System.err.printf("\nExcepcion: %s\n", e);
						sc.nextLine();
						System.out.println("Debe introducir valores positivos. Intente de nuevo.\n");
					}
					System.out.println("Seguir modificando edad: (S/N):");
					siono = sc.next();
					if (siono.equalsIgnoreCase("N")) {
						edadBucle = false;
					}
				} while (edadBucle);
				System.out.println("\nCaracteristicas de " + g1.getNombre() + ":\n" + g1.toString());
			} catch (ExceptionEntradaNombre e) {
				System.err.printf("\nExcepcion: %s\n", e);
				sc.nextLine();
				System.out.println("Debe introducir al menos 3 letras. Intente de nuevo.\n");

			} catch (ExceptionEntradaEdad e) {
				System.err.printf("\nExcepcion: %s\n", e);
				sc.nextLine();
				System.out.println("Debe introducir valores positivos. Intente de nuevo.\n");
			}
			// sc.close();

		} while (bucle);
	}

}
