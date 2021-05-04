package ejerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioB5 {

	public static void main(String[] args) throws Exception {
		// Creando ruta y directorio
		File rutaDicc = new File("./Diccionario");
		File rHaciaDicc = new File("diccionario.txt");
//		rutaDicc.mkdir();
		// Creando archivos
		crearAlfabeto(rutaDicc);
		try {
			extraerPalabraTo(rHaciaDicc, rutaDicc);//Extraer palabra de un fichero dado
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static void crearAlfabeto(File ruta) {
		String alfab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String a;
		char[] letraAlfab;
		letraAlfab = alfab.toCharArray();
		for (int i = 0; i < letraAlfab.length; i++) {
			a = Character.toString(letraAlfab[i]);
			File origenAlf = new File(ruta, a + ".txt");
			try {
				origenAlf.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

//	public static void recorreDiccionario() {
//		File recAlf = new File("./Diccionario");
//		String recorr[] = recAlf.list();
//		for (int i = 0; i < recorr.length; i++) {
//			System.out.println(recorr[i]);
//		}
//	}

	public static void extraerPalabraTo(File rutaOrigen, File rutaDestino) throws FileNotFoundException {
		File path = new File(rutaDestino.getPath());
		String[] listRuta = rutaDestino.list();
		String letras = "";
		int j;
		if (path.exists()) {
			Scanner lector = new Scanner(rutaOrigen);
			while (lector.hasNext()) {
				String value = lector.nextLine();
				letras = value;
				String x =letras.substring(0, 1);
				j = busquedaSecuencial(listRuta, x + ".txt");//para que de igual el orden
				if (letras.substring(0, 1).equalsIgnoreCase(listRuta[j].substring(0, 1))) {
					File f = new File(rutaDestino, listRuta[j]);
					FileWriter escribirFichero = null;
					try {
						escribirFichero = new FileWriter(f);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
					try {
						escribirFichero.write(letras);
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							escribirFichero.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			lector.close();
		} else {
			throw new FileNotFoundException("La ruta no existe!!!");
		}
	}

	public static int busquedaSecuencial(String[] v, String elemento) {
		int j, posicion = -1;
		for (j = 0; j < v.length && posicion == -1; j++) {
			if (v[j].equalsIgnoreCase(elemento)) {
				posicion = j;
			}
		}
		return posicion;
	}
}