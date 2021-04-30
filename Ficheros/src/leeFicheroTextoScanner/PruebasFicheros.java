package leeFicheroTextoScanner;

import java.io.File;
import java.util.Scanner;

public class PruebasFicheros {

	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
		try {
			// Intentamos abrir el fichero
			File f = new File("Enteros.txt");
			Scanner lector = new Scanner(f);
			// Si llega aquí es que ha abierto el fichero :)
//			for (int i = 0; i < NUM_VALORES; i++) {//con for y un numero determinado
//				int valor = lector.nextInt();
//				System.out.println("El valor leído es: " + valor);
//			}
			while (lector.hasNext()) {
				String value = lector.nextLine();
				System.out.println("El valor leído es: " + value);
			}
			// ¡Hay que cerrar el fichero!
			lector.close();
		} catch (Exception e) {
			// En caso de excepción mostramos el error
			System.out.println("Error: " + e);
			e.printStackTrace();
		}
	}

}
