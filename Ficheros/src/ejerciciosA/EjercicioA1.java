package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioA1 {

	public void muestraInfoRuta(File ruta) throws FileNotFoundException {
		if (ruta.exists()) {

			if (ruta.isFile()) {
				System.out.println("- " + ruta.getName());
			}
			if (ruta.isDirectory()) {
				File directorio[] = ruta.listFiles();
				System.out.println("\nContenido del directorio:");
				for (File f : directorio) {
					if (f.isDirectory()) {
						System.out.println("- [*]" + f.getName());
					}
				}
				for (File f : directorio) {
					if (f.isFile()) {
						System.out.println("- [A]" + f.getName());
					}
				}
			}
		} else {
			throw new FileNotFoundException("Error, no es un directorio ni un archivo");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		String ruta;
		boolean in = true;
		EjercicioA1 a1 = new EjercicioA1();
		while (in) {
			System.out.println("____________________________\n- Introduce ruta valida: ");
			ruta = entrada.nextLine();
//			in = (ruta.length() == 0) ? false : true;
			if (ruta.length() == 0) {
				in = false;
			} else {
				try {
					File file = new File(ruta);
					a1.muestraInfoRuta(file);
				} catch (FileNotFoundException e) {
					System.err.println(e);
				}
			}
		}
		entrada.close();
	}
}
