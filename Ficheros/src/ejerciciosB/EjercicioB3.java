package ejerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioB3 { 

	public static void main(String[] args) throws FileNotFoundException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n\t-Gestion de archivos-");
		System.out.println("Introduce ruta del archivo a leer:");
		String ruta1 = entrada.nextLine();
		System.out.println("Introduce ruta del archivo a escribir: ");
		String ruta2 = entrada.nextLine();
		// NOTA MENTAL// Este es con un array////EjercicioB5 se hubiese podido hacer
		// asi, con un File[]??????
		try {
			escribeEnRuta(extraeOrdenado(EjercicioB2.abrirArchivo(ruta1)), EjercicioB2.abrirArchivo(ruta2));
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		entrada.close();
	}

	public static String[] extraeOrdenado(File arch1) throws FileNotFoundException {
		String[] listaNombres = null;
		if (arch1.exists()) {
			Scanner lector = new Scanner(arch1);//significa que el archivo pasado va a ser escaneado
			while (lector.hasNext()) {
				String value = lector.nextLine();
				listaNombres = value.split(", ");/// no hace falta indexar para meter los valores al array
			}
			lector.close();
		} else {
			throw new FileNotFoundException("No existe archivo");
		}
		Arrays.sort(listaNombres);// Ordenado de lista por orden alfabetico
		return listaNombres;// Arrays.asList(listaNombres)
	}

	public static void escribeEnRuta(String[] contenido, File ruta) throws IOException {
		FileWriter rutaEscribir = new FileWriter(ruta);
		
			for (int i = 0; i < contenido.length; i++) {

				try {
					rutaEscribir.write(contenido[i] + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				rutaEscribir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}