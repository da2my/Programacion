package controller;

import java.util.ArrayList;

import model.Planeta;
import model.Satelite;

import java.util.Scanner;

public class MainAstros {

	private static Scanner sc = new Scanner(System.in);
	ArrayList<Satelite> nomSatelites;// = new ArrayList<>();// SUPER IMPORTANTE, ME ESTUVE COMIENDO LA CABEZA PARA
										// SABER COMO UTILIZABA EN UN METODO ESTE ARRAYLIST Y
										// DESPUES VOLVERLO A UTILIZAR EN OTRO METODO
	private static ArrayList<Satelite> listSatelites = new ArrayList<>();
	private static ArrayList<Planeta> listPlanetas = new ArrayList<>();

	public MainAstros(ArrayList<Satelite> s, ArrayList<Planeta> p) {
		MainAstros.listSatelites = s;
		MainAstros.listPlanetas = p;
	}

	public ArrayList<Satelite> getS() {
		return listSatelites;
	}

	public void setS(ArrayList<Satelite> s) {
		MainAstros.listSatelites = s;
	}

	public ArrayList<Planeta> getP() {
		return listPlanetas;
	}

	public void setP(ArrayList<Planeta> p) {
		MainAstros.listPlanetas = p;
	}

//////////////////////////////////////////////

	public static void main(String[] args) {
		ArrayList<Satelite> listSat = listSatelites;
		ArrayList<Planeta> listPla = listPlanetas;
		System.out.println();
		int opcion;
		do {
			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				aniadirPlaneta();
				break;
			case 2:
				aniadirSatelite();
				break;
			case 3:
				for (Planeta planets : listPla) {
					System.out.println(planets.muestra());
				}
				break;
			case 4:
				for (Satelite sat : listSat) {
					System.out.println(sat.muestra());
				}
				break;
			case 0:
				opcion = 0;
				break;
			default:
				System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
			}
		} while (opcion != 0);
		sc.close();
	}

	public static void menu() {
		System.out.println("AGENCIA ASTRO MEDIA");
		System.out.println("===================");
		System.out.println("1. Añadir Planeta");
		System.out.println("2. Añadir Satelite");
		System.out.println("3. Lista de planetas");
		System.out.println("4. Lista de satelites");
		System.out.println("0. Salir del programa\n\n");
		System.out.print("Introduzca una opcion: ");
		System.out.println();
	}

	public static void aniadirPlaneta() {
		String siono;
//		ArrayList<Planeta> planetas = new ArrayList<>();
		do {

			System.out.print("Introduzca el radio: ");
			float radio = sc.nextFloat();
			System.out.print("Introduzca la rotacion: ");
			float rotacion = sc.nextFloat();
			System.out.print("Introduzca la masa: ");
			float masa = sc.nextFloat();
			System.out.print("Introduzca la temperatura: ");
			float temp = sc.nextFloat();
			System.out.print("Introduzca la gravedad: ");
			float gravedad = sc.nextFloat();
			System.out.print("Introduzca distancia al sol: ");
			float distSol = sc.nextFloat();
			System.out.print("Introduzca la orbita al sol: ");
			float orb = sc.nextFloat();
			System.out.print("Introduzca el nombre: ");
			String nombre = sc.next();
			System.out.println("Quieres introducir satelites?? (S/N):");
			siono = sc.next();
//		s = aniadirSatelite();
//		nomSatelites = (siono.equalsIgnoreCase("S")) ? aniadirSatelite() : null;
			if (siono.equalsIgnoreCase("S")) {
				aniadirSatelite();
//				for (Satelite satelite : aniadirSatelite()) {
//					satelite.getNombre();
//				}

			}
			listPlanetas.add(new Planeta(radio, rotacion, masa, temp, gravedad, distSol, orb, nombre, listSatelites));

			System.out.println("Quieres introducir mas planetas?? (S/N):");
			siono = sc.next();
		} while (siono.equalsIgnoreCase("S"));
	}

//	public static ArrayList<String> nomSat() {
//		ArrayList<String> nomSat = new ArrayList<>();
//		for (Satelite satelite : s) {
//			String nom;
//			nomSat = satelite.getNombre();
//		}
//		return nomSat;
//	}

	public static void aniadirSatelite() {//
		String siono;
//		ArrayList<Satelite> satelites = new ArrayList<>(); // para utilizarla fuera de este metodo

		// Como extraigo la informacion introducida a este
		// arraylist
		do {
			System.out.println("Añadir nuevo Satelite");
			System.out.print("Introduzca el radio: ");
			float radio = sc.nextFloat();
			System.out.print("Introduzca la rotacion: ");
			float rotacion = sc.nextFloat();
			System.out.print("Introduzca la masa: ");
			float masa = sc.nextFloat();
			System.out.print("Introduzca la temperatura: ");
			float temp = sc.nextFloat();
			System.out.print("Introduzca la gravedad: ");
			float gravedad = sc.nextFloat();
			System.out.print("Introduzca distancia a su planeta: ");
			float dist = sc.nextFloat();
			System.out.print("Introduzca la orbita a su planeta: ");
			int orb = sc.nextInt();
			System.out.print("Introduzca el nombre: ");
			String nombre = sc.next();
			listSatelites.add(new Satelite(radio, rotacion, masa, temp, gravedad, dist, orb, nombre));// nombre lo tengo
																										// que
			// saco el nombre de satelites a nomSatelites a traves de este foreach
//			for (Satelite s : s) {
//				nomSatelites.add(s.getNombre());
//			}
			System.out.println("Quieres introducir mas satelites?? (S/N):");
			siono = sc.next();
		} while (siono.equalsIgnoreCase("S"));

	}
}