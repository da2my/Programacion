package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_12 {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		boolean salir = true;
		String opcion = "";

		while (salir) {
			System.out.println("Menu, elige opcion:" + "\n" + "a. Mostrar valores." + "\n" + "b. Introducir valor."
					+ "\n" + "c. Salir.");

			opcion = sc.next();
			switch (opcion) {
			case "a":
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				break;
			case "b":
				int v, p;
				String aux;
				boolean continuar = true;
				do {
					System.out.println("Valor para almacenar: ");
					v = sc.nextInt();
					System.out.println("Posición donde almacenar: ");
					p = sc.nextInt();
					System.out.println("Volver a Menu s/n?");
					aux = sc.next();
					if (aux.equals("s")) {
						continuar=false;
						if (p > arr.length || p < 0 ) {
							System.out.println("Valor no admitido!");
						}else {
							arr[p]=v;
						}
					}else {
						if (p > arr.length || p < 0 ) {
							System.out.println("Valor no admitido!");
						} else {
							arr[p] = v;

						}
					}
				} while (continuar);
				break;
			case "c":
				salir = false;
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
		}
	}

//	static int[] guardaArray() {
//		Scanner sc = new Scanner(System.in);
//		int t;
//		int v;
//		int p;
//		int aux = 0;
//		System.out.println("Tamaño de la lista: ");
//		t = sc.nextInt();
//		int arr[] = new int[t];
//		do {
//			System.out.println("Valor para almacenar: ");
//			v = sc.nextInt();
//			System.out.println("Posición donde almacenar: ");
//			p = sc.nextInt();
//			arr[p] = v;
//			aux++;
//		} while (aux != t);
//		return arr;
//	}

//	static void muestraArray() {
//		int arr[] = new int[guardaArray().length];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
}
