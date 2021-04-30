package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioA4 {
	static Scanner sc = new Scanner(System.in);
	static String sino = "";

	public static void crearCarpetas() {
		boolean dir;

		File origen = new File("Documentos/Mis Cosas");// E:/Escritorio/Ficheros/Documentos
		File origen1 = new File("Documentos/Alfabeto");// E:/Escritorio/Ficheros/Documentos
		System.out.println("\t-Gestion de archivos y directorios-\nSe van crear estos directorios: \n"
				+ origen.getName() + "\n" + origen1.getName() + "\nEn esta ruta: " + origen.getParent());
		if (origen.exists() && origen1.exists()) {
			System.out.println("Carpetas ya existen");
		} else {
			System.out.println("Quieres crearlas (s/n)?");
			sino = sc.next();
			if (sino.equalsIgnoreCase("s")) {
				File origenD1 = new File("Documentos/Mis Cosas");// E:/Escritorio/Ficheros/Documentos
				dir = origenD1.mkdir();
				File origenD2 = new File("Documentos/Alfabeto");// E:/Escritorio/Ficheros/Documentos
				dir = origenD2.mkdir();
				System.out.println("Se han creado las carpetas?? " + dir);
			}
		}
	}

	public static void mueveCarpetas() {

		try {

			File pathF = new File("./Fotografias");
			File pathL = new File("./Libros");
			System.out.println(pathF.exists());
			System.out.println(
					"\nQuieres mover las carpetas: (s/n)\n" + pathF.getName() + "\n" + pathL.getName() + "\n??");
			sino = sc.next();
			if (new File("Documentos/Mis Cosas/Fotografias").exists()
					&& new File("Documentos/Mis Cosas/Libros").exists()) {
				System.out.println("Ya han sido movidos los directorios");
			} else {
				if ((pathF.exists() && pathL.exists() && sino.equalsIgnoreCase("s"))) {
					boolean res1;
					File pathMovF = new File("./Documentos/Mis Cosas");
					res1 = pathF.renameTo(new File(pathMovF, pathF.getName()));// new File(pathMovF, pathF.getName())
					//////////////
					File pathMovL = new File("./Documentos/Mis Cosas");
					res1 = pathL.renameTo(new File(pathMovL, pathL.getName()));// new File(pathMovL, pathL.getName())
					System.out.println("Se han movido las carpetas? " + res1);
				} else {
					throw new FileNotFoundException("¡Error no existe directorio!");
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	public static void crearAlfabeto() {
		String alfab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String a;
		char[] letraAlfab;
		letraAlfab = alfab.toCharArray();
		for (int i = 0; i < letraAlfab.length; i++) {
			a = Character.toString(letraAlfab[i]);
			File origenAlf = new File("Documentos/Alfabeto", a);
			origenAlf.mkdir();

		}
	}

	public static void main(String[] args) {
//		crearCarpetas();

		mueveCarpetas();

//		crearAlfabeto();
	}
}
