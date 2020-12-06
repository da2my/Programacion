package vectores.ejerciciosA;

import java.util.*;

public class Ejercicio_04 {

	public static void main(String[] args) {
		muestraArray(guardaArray());
	}

	static int[] guardaArray() {
		int num = 0;
		int arr[] = new int[20];
		for (int i = 0; i < arr.length; i++) {
			num = (int) (Math.random() * 50 * 2 - 50);
			arr[i] = num;
		}
		return arr;
	}

	static void muestraArray(int[] arr) {
		double resultP = 0, resultN=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				resultP+=arr[i];
			}else {
				resultN+=arr[i];
			}
		System.out.println(arr[i]);
		}
		System.out.println("La suma de los valores positivos es: "+resultP+ "\n" + "La suma de los valores negativos es: " +resultN);
	}
}
