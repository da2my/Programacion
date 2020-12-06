package vectores.ejerciciosA;

import java.util.*;

public class Ejercicio_03 {

	public static void main(String[] args) {
		System.out.println("Introduce valores: ");
		maxminArray(guardaArray());
	}

	static double[] guardaArray() {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextDouble();
		return arr;
	}

	static void maxminArray(double[] arr) {
		double min = 1000000000;
		double max = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] > max) {
				max = arr[i];
			}else if (arr[i]<min) {
				min=arr[i];
			}
		System.out.println("El valo maximo es: " + max + "\n"+"El valor minimo es: " + min);
	}

}
