package ejerciciosB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

public class EjercicioB1 {

	// Salida por consola
	public static void main(String[] args) {

		try {
			/////// Crear archivo
			abrirArchivo().createNewFile();

			//////// Agregar contenido, pasado por parametro, al archivo creado que es
			//////// tambien pasado por parametro
			agregarContenido(generaValoresAleatorios(), abrirArchivo());

			/// Lee archivo
			System.out.println("Contenido del fichero:");
			leerArchivo(abrirArchivo());

		} catch (IOException e) {
			e.printStackTrace();
		}

		/////// Valor minimo
		try {
			System.out.println(valorMinimo(convertirArrayToInt(obtenerContenArchivo(abrirArchivo()))));
			System.out.println(valorMaximo(convertirArrayToInt(obtenerContenArchivo(abrirArchivo()))));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodos
	public static File abrirArchivo() throws FileNotFoundException {
		File f = new File("numeros.txt");
		return f;
	}

	public static void agregarContenido(int[] cont, File archivo) {
		////////// Escribir archivo
		try {
			FileWriter escribirFichero = new FileWriter(archivo);
			for (int i : cont) {
				escribirFichero.write(i + ", ");// Este metodo obtiene una lista en horizontal, en este caso de int

			}
			escribirFichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	////////// USANDO FileReader, BufferedReader, split() y Array/Vector para
	////////// retornar
	public static String[] obtenerContenArchivo(File archivo) throws IOException {// String[]
		// se dividen en varias cadenas mediante una expresion regular, que en este caso
		// es ", "
		BufferedReader br = null;
		FileReader fr = null;
		String cont = null;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			cont = br.readLine();// guardo en una variable, su contenido sigue siendo horizontal
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		return cont.split(", ");// guardo en un array e contenido solo de los numeros;
	}

	public static int[] convertirArrayToInt(String[] str) throws IOException {
		int cont = 0;
//		String [] s = obtenerContenArchivo();
		int[] i = new int[str.length];
		for (String ss : str) {
			i[cont++] = Integer.parseInt(ss);
		}
		return i;
	}

	public static void leerArchivo(File arch) throws FileNotFoundException {//////////////////////// problema
//		int[] cont = new int[generaValoresAleatorios().length];
		if (arch.exists()) {
			Scanner lector = new Scanner(arch);
			while (lector.hasNext()) {
				String value = lector.nextLine();
//				for (Integer i : cont) {
//					System.out.println(i);
//				}
				System.out.println(value);
			}
			lector.close();
		} else {
			throw new FileNotFoundException("No existe archivo");
		}
//		return cont;
	}

	public static String valorMinimo(int[] cont) {
		OptionalInt minimo = Arrays.stream(cont).reduce(Integer::min);
		String msg = minimo.isPresent() ? "El valor minimo es: " + minimo.getAsInt() : "no hay vamor minimo";
		return msg;
	}

	public static String valorMaximo(int[] cont) {
		OptionalInt maximo = Arrays.stream(cont).reduce(Integer::max);
		String msg = maximo.isPresent() ? "El valor maximo es: " + maximo.getAsInt() : "no hay vamor maximo";
		return msg;
	}

	// Metodo generador de contenido
	public static int[] generaValoresAleatorios() {
		return new Random().ints(100, 0, 1000).toArray();
	}

}
