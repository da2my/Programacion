package ejerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioB4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t-Registro civil-");
		System.out.println("Introduce numero de nombres que quieres componer: ");
		int num = sc.nextInt();
		System.out.println("Introduce archivo a escribir los nombres: ");
		String arch=sc.next();
		registroNomComp(num, EjercicioB2.abrirArchivo(arch));
	}

	public static String nombre() {
		String nombre = "";
		ArrayList<String> listNom = new ArrayList<>();
		try {
			Scanner lectura = new Scanner(EjercicioB2.abrirArchivo("usa_nombres.txt"));
			while (lectura.hasNext()) {
				String s = lectura.nextLine();
//				listNom=s.split(" ");// si el archivo tiene las palabras en vertical, necesario " " o "\n"///////
				listNom.add(s);//////// mejor opcion sin duda////////
			}
			lectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		nombre = listNom.get((int) (Math.random() * listNom.size()));
		return nombre;
	}

	public static String apellido() {
		String apellido = "";
		ArrayList<String> listApell = new ArrayList<>();
		try {
			Scanner lectura = new Scanner(EjercicioB2.abrirArchivo("usa_apellidos.txt"));
			while (lectura.hasNext()) {
				String s = lectura.nextLine();
				listApell.add(s);////// mejor opcion sin duda///////
			}
			lectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		apellido = listApell.get((int) (Math.random() * listApell.size()));
		return apellido;
	}

	public static ArrayList<String> nomCompletoRandom() {
		ArrayList<String> nombreComp = new ArrayList<>();
		nombreComp.add(nombre() + " " + apellido());
		return nombreComp;
	}

	public static void registroNomComp(int cantNom, File arch) {
		try {
			FileWriter escribe = new FileWriter(arch);
			for (int i = 0; i < cantNom; i++) {
				for (String s : nomCompletoRandom()) {
					escribe.write(s + "\n");
				}
			}
			escribe.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}