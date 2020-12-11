package vectores.ejerciciosA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		muestraArray(guardaArray());
	}

	static double[] guardaArray() {
		double num = 0;
		double arr[] = new double[100];
		for (int i = 0; i < arr.length; i++) {
			num = Math.random();
			arr[i] = num;
		}
		return arr;
	}

	static void muestraArray(double[] arr) {
		DecimalFormat df = new DecimalFormat("#.#");
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero real: ");
		double r = sc.nextDouble();
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > r || arr[i] == r) {
				cont++;
			}
			System.out.println(df.format(arr[i]));// Puedo meter aqui el obj. df porque es de tipo double como el array
		}
		System.out.println("Hay " + cont + " valores mayores que el numero real.");
	}
}
