package controller;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int posicion = 0;
		double cantidad = 0;
		double aux = 0;
		String salida;

		System.out.println("Billetes/monedas disponibles, con su posición: ");
		double[] numMonedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
		int cont = 0;
		for (double f : numMonedas) {
			System.out.println("	" + f + " €" + "	-->	   " + cont++);
		}

		while (check) {
			System.out.println("Elige posición de billete/moneda: ");
			posicion = sc.nextInt();
			System.out.println("Has elegido: " + Array.get(numMonedas, posicion));// Corregir excepcion!!!
			switch (posicion) {
			case 0:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[0] * sc.nextInt());
				break;
			case 1:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[1] * sc.nextInt());
				break;
			case 2:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[2] * sc.nextInt());
				break;
			case 3:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[3] * sc.nextInt());
				break;
			case 4:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[4] * sc.nextInt());
				break;
			case 5:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[5] * sc.nextInt());
				break;
			case 6:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[6] * sc.nextInt());
				break;
			case 7:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[7] * sc.nextInt());
				break;
			case 8:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[8] * sc.nextInt());
				break;
			case 9:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[9] * sc.nextInt());
				break;
			case 10:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[10] * sc.nextInt());
				break;
			case 11:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[11] * sc.nextInt());
				break;
			case 12:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[12] * sc.nextInt());
				break;
			case 13:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[13] * sc.nextInt());
				break;
			case 14:
				System.out.println("Elige el numero de billetes/monedas: ");
				cantidad = (numMonedas[14] * sc.nextInt());
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
			System.out.println("Para acabar escribe 'salir'. Si quieres continuar pulsa cualquier tecla");
			salida = sc.next();
			if (salida.equalsIgnoreCase("salir")) {
				check = false;
			}
			aux += cantidad;
		}
		System.out.println("Cantidad total de euros: "+aux+ "€");
	}
}
