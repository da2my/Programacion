package controlador.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.ejercicios.ExceptionEntradaEdad;
import modelo.ejercicios.ExceptionEntradaNombre;
import modelo.ejercicios.Gato;

public class MainGatoCopia {

	static ArrayList<Gato> collGatos = new ArrayList<>();///////////////////////////***USO***///////////////////////
	static int contNom = 1;
	static int contEdad = 1;
	
	public static void main(String[] args) throws Exception {

		MainGatoCopia coll = new MainGatoCopia();
		coll.recorreGatos();

		for (Gato g : collGatos) {
			System.out.println(g.toString());
		}
	}

	public void collGatos() {
		ArrayList<Gato> cats = new ArrayList<>();
		cats.add(new Gato());
		cats.add(new Gato());
		cats.add(new Gato());
		cats.add(new Gato());
		cats.add(new Gato());
		collGatos = cats;////////////////////////***USO***////////////////////
	}

	public void recorreGatos() {
		collGatos();
		System.out.println("Datos de los " + collGatos.size() +" gatos: ");
		for (int i = 0; i < collGatos.size(); i++) {
			datosCadaGato(collGatos.get(i));
		}
	}

	public static void datosCadaGato(Gato g) {
		Scanner sc = new Scanner(System.in);
		boolean bucleNom = true;
		boolean bucleEdad = true;
		
		do {
			try {
				System.out.println("Introducir nombre del "+contNom+"º: ");
				g.setNombre(sc.next());
				bucleNom = false;
				contNom++;
			} catch (ExceptionEntradaNombre e) {
				System.err.printf("\nExcepcion: %s\n", e);
				sc.nextLine();
				System.out.println("Debe introducir al menos 3 letras. Intente de nuevo.\n");
			}
		} while (bucleNom);
		do {
			try {
				System.out.println("Introducir edad del "+contEdad+"º: ");
				g.setEdad(sc.nextInt());
				bucleEdad = false;
				contEdad++;
			} catch (ExceptionEntradaEdad e) {
				System.err.printf("\nExcepcion: %s\n", e);
				sc.nextLine();
				System.out.println("Debe introducir valores positivos. Intente de nuevo.\n");
			}
		} while (bucleEdad);
		System.out.println("\n__________________________\n");
	}
}