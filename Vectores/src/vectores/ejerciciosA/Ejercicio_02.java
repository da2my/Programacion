package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {

		System.out.println("Introduce valores para sumar: ");
		sumaArray(guardaArray());
	}

	static double[] guardaArray() {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextDouble();
		return arr;

	}

	static void sumaArray(double[] guardaAray) {
		double resultado = 0;
		for (int i = 0; i < guardaAray.length; i++) {// solamente utilizo los valores guardados, solo recorro con el for
														// los valores guardados
			resultado += guardaAray[i];
			System.out.println("El resultado es: " + resultado);
		}
	}
}
