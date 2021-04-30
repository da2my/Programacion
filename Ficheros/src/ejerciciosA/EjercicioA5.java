package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;

public class EjercicioA5 {

	public static boolean borraTodo(File s) {
		File[] listado = s.listFiles();
		try {
			if (s.exists()) {
				if (s.isFile()) {
					s.delete();
				} else {
					for (File fa : listado) {
						fa.delete();
					}
					s.delete();
				}
			} else {
				throw new FileNotFoundException("No existe Directorio");
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return s.exists();
	}

	public static void main(String[] args) {
		File s = new File("E:/Escritorio/FicherosF/Fotografias");
		System.out.println("Ha podido borrar el directorio paso por parametro: " + borraTodo(s));
		
		File r = new File("E:/Escritorio/FicherosF/Libros");
		System.out.println("Ha podido borrar el directorio paso por parametro: " + borraTodo(r));
		
		File e = new File("E:/Escritorio/FicherosF/Documentos");
		System.out.println("Ha podido borrar el directorio paso por parametro: " + borraTodo(e));
	}
}