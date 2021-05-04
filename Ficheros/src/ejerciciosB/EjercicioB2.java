package ejerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjercicioB2 {

	public static void main(String[] args) {
		///// Lee archivo
		try {
			System.out.println("Notas de los alumnos: ");
			EjercicioB1.leerArchivo(abrirArchivo("alumnos_notas.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		////// Obtener resultado del archivo
		System.out.println("\nLa media de las notas es:");/////
		try {
			obtenerContenArchivo(abrirArchivo("alumnos_notas.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Metodos
	public static File abrirArchivo(String ruta) {
		return new File(ruta);
	}

	public static void obtenerContenArchivo(File archivo) throws IOException {
		Scanner lector = new Scanner(archivo);
		while (lector.hasNext()) {
			String value = lector.nextLine();
			for (String s : extraerString(value)) {///Esto es claveeeeee////
				System.out.print(s);
			}
			calNotaMedia(extraerNumeros(value));
		}
//		numlist.clear();
		lector.close();
	}

	public static List<Integer> extraerNumeros(String cadena) {
		List<Integer> todosLosNumeros = new ArrayList<>();
		Matcher encontrar = Pattern.compile("\\d+").matcher(cadena);
		while (encontrar.find()) {
			todosLosNumeros.add(Integer.parseInt(encontrar.group()));
		}
		return todosLosNumeros;
	}

	public static List<String> extraerString(String cadena) {
		List<String> todosString = new ArrayList<>();
		Matcher encontrar = Pattern.compile("[a-z A-Z]").matcher(cadena);
		while (encontrar.find()) {
			todosString.add(encontrar.group());
		}
		return todosString;
	}

	public static void calNotaMedia(List<Integer> notas){
		int cont = 0;
		double sumador = 0;
		for (int i = 0; i < notas.size(); i++) {
			sumador += notas.get(cont);
			cont++;
		}
		try {
			System.out.println("-> " + sumador / cont);
		} catch (ArithmeticException e) {
			System.err.println("Error en la division, intenta de nuevo");
		}
	}
}
