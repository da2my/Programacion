package vectores.ejerciciosA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		muestraArray(guardaArray());
	}

	static double[] guardaArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas alturas vas a almacenar: ");
		double arr[] = new double[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Dime altura: ");
			arr[i] = sc.nextDouble();
		}
		return arr;
	}

	static void muestraArray(double[] arr) {
		DecimalFormat df = new DecimalFormat("#.##");
		double max;
		double min;
		double sum = 0;
		double media;
		for (int i = 0; i < arr.length; i++) {// Sumar los valores
			sum += arr[i];
		}
		media = sum / arr.length;// Dividir la suma de los valores entre la suma de todos ellos para sacar la
		// media
		max = media;// Y como se compara a partir de la media; si los valores son mayores a la media
		// los muestre
		min = media;// y los valores que son menores a la media los muestre
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("La media de estas alturas es: " + df.format(media) + "m" + "\n" + "La altura maxima es: "
				+ max + "m" + "\n" + "La altura minima es: " + min + "m");
	}

}
