package ejerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioB5 {

	public static void main(String[] args) throws Exception {
		// Creando ruta y directorio
		File rutaDicc = new File("./Diccionario");
//		rutaDicc.mkdir();
		// Creando archivos
//		crearAlfabeto(rutaDicc);
		try {
//			extraerPalabraTo(rutaDicc);
			recorreDiccionario();
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
	
	public static void recorreDiccionario() {
		File recAlf = new File("./Diccionario");
		String recorr[]=recAlf.list();
		for (int i = 0; i < recorr.length; i++) {
			System.out.println(recorr[i]);
		}
	}

	public static void extraerPalabraTo(File ruta) throws FileNotFoundException {
		File path = new File(ruta.getPath());
		String[] listRuta = ruta.list();
		String letras = "";
		int i = 0;
		int j;
		if (path.exists()) {
			File rHaciaDicc = new File("diccionario.txt");
			Scanner lector = new Scanner(rHaciaDicc);
			while (lector.hasNext()) {
				String value = lector.nextLine();
				letras = value;
				String l = letras.substring(0,1);
//				i++;//Busqueda binaria o secuencial
				j=busquedaSecuencial(listRuta, letras.substring(0,1));
				if (letras.substring(0,1).equalsIgnoreCase(listRuta[j])) {
					FileWriter leeFichero = null;
					try {
						leeFichero = new FileWriter(listRuta[j]);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						leeFichero.write(letras);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
//				char[] palabra=letras.toCharArray();
//				for (int i = 0; i < palabra.length; i++) {
//					char c = palabra[i];
//					palabra[0];
//				}
				System.out.println(l);
			}
			lector.close();

//			System.out.println(letras);
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