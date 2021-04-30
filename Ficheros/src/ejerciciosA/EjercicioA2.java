package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioA2 {

	public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {

		if (ruta.exists()) {

			if (ruta.isFile()) {
				if (info) {
					System.out.println("- " + ruta.getName() + "\t" + ruta.length() + "bytes\t" + ruta.lastModified()
							+ " Ultima Modificacion(ms)");
				} else {
					System.out.println("- " + ruta.getName());
				}
			}
			if (ruta.isDirectory()) {
				File directorio[] = ruta.listFiles();
				Arrays.sort(directorio);
				System.out.println("\nContenido del directorio:");
				for (File f : directorio) {
					if (f.isDirectory()) {
						if (info) {
							System.out.println("- [*]" + f.getName() + "\t" + f.length() + "bytes\t" + f.lastModified()
									+ " Ultima Modificacion(ms)");

						} else {
							System.out.println("- [*]" + f.getName());
						}
					}
				}
				for (File f : directorio) {
					if (f.isFile()) {
						if (info) {
							System.out.println("- [A]" + f.getName() + "\t" + f.length() + "bytes\t" + f.lastModified()
									+ " Ultima Modificacion(ms)");
						} else {
							System.out.println("- [A]" + f.getName());
						}
					}
				}
			}
		} else {
			throw new FileNotFoundException("Error, no es un directorio ni un archivo\n\t\t\t\t\t Comprueba ruta!!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f;
		boolean info;
		boolean in = true;
		String sino = "";
		while (in) {
			System.out.println("____________________________\n- Introduce ruta valida: ");
			f = sc.nextLine();
			if (f.length() == 0) {
				in = false;
			} else {
				try {
					File file = new File(f);
					System.out.println("Ruta a comprobar: \n" + file.getAbsolutePath() + "\nQuieres informacion extra de la ruta (s/n)??");//"Ruta a comprobar: \n" + f.getAbsolutePath() + 
					sino = sc.nextLine();
					info = (sino.equalsIgnoreCase("s")) ? true : false;
					muestraInfoRuta(file, info);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println(e);
				}
			}
		}
		sc.close();
	}
}
