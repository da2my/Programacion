package vectores.ejerciciosA;

import java.util.Arrays;

public class Ejercicio_18 {

	public static void main(String[] args) {

		int [] array = new int[30];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
