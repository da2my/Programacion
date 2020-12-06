package vectores.ejerciciosA;

import java.util.Scanner;

//1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
//luego muestre todos sus valores.
public class Ejercicio_01 {

	public static void main(String[] args) {
		System.out.println("Introduce valores para mostrar: ");
		muestraArray(guardaArray());
	}

	static double[] guardaArray() {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextDouble();
		return arr;
	}

	static void muestraArray(double[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
