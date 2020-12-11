package vectores.ejerciciosA;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		muestraArray(guardaArray());
	}

	static int[] guardaArray() {
		int num = 0;
		int arr[] = new int[100];
		for (int i = 0; i < arr.length; i++) {
			num = (int) (Math.random() * 10);
			arr[i] = num;
		}
		return arr;
	}

	static void muestraArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int p = sc.nextInt();
		System.out.println();
		int cont = -1;
		int cont1 = -1;
		for (int i = 0; i < arr.length; i++) {
			cont++;
			System.out.println("Posición[" + cont + "]	" + arr[i]);
		}
		System.out.println("\n"+"Las posiciones que coinciden "+p+" son: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == p) {
				cont1 = i;
				System.out.println("Posición[" + cont1 + "]	");
			}
		}
	}

}
