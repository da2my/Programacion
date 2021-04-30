package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioA3 {

	public static void cambiarNombreCarpeta() {

		File pathD = new File("E:/Escritorio/Ficheros/Documentos");
		File pathF = new File("E:/Escritorio/Ficheros/Fotografias");
		File pathL = new File("E:/Escritorio/Ficheros/Libros");

		try {
			if (pathD.exists() || pathF.exists() || pathL.exists()) {
				File pathAltD = new File("E:/Escritorio/Ficheros/DOCS");
				boolean res = pathD.renameTo(pathAltD);
				System.out.println("Se ha renombrado la carpeta? " + res);
				////////////
				File pathAltF = new File("E:/Escritorio/Ficheros/FOTOS");
				boolean res1 = pathF.renameTo(pathAltF);
				System.out.println("Se ha renombrado la carpeta? " + res1);
				////////////
				File pathAltL = new File("E:/Escritorio/Ficheros/LECTURAS");
				boolean res2 = pathL.renameTo(pathAltL);
				System.out.println("Se ha renombrado la carpeta? " + res2);
			} else {
				throw new FileNotFoundException();
			}
		} catch (Exception e) {
			System.err.println("Error, no existe ruta!!");
		}

	}

	public static void quitarExtension() {
		File pathD = new File("E:/Escritorio/Ficheros/FOTOS");
		File pathDE = new File("E:/Escritorio/Ficheros/LECTURAS");
		File directorio[] = pathD.listFiles();
		File directorio1[] = pathDE.listFiles();
		File directorioT[] = new File[directorio.length + directorio1.length];
		System.arraycopy(directorio, 0, directorioT, 0, directorio.length);
		System.arraycopy(directorio1, 0, directorioT, directorio.length, directorio1.length);
		String path = "";
		String pathX = "";
		boolean res1 = false;
		File fX = null;
		File r = null;
		for (File f : directorioT) {
			if (f.isFile()) {
				path = f.getAbsolutePath();// para recorrer
				fX = new File(path);
//				System.out.println(path);
				for (int i = 0; i < path.length() - 4; i++) {// quito la extension
					pathX += path.charAt(i);
				}
				r = new File(pathX);
//				System.out.println(fX.getAbsolutePath());
//				System.out.println(r.getAbsolutePath());
				res1 = fX.renameTo(r);//////////////////////
			}
			pathX = "";
//		System.out.println(fX.getAbsolutePath());
		}
		System.out.println("Se han renombrado los archivos? " + res1 + "\n");
	}

	public static void main(String[] args) {

		//Cambiar nombre de carpetas
		cambiarNombreCarpeta();
		
		//Quitar extension de archivos
		quitarExtension();

//		entrada.close();
	}

}


