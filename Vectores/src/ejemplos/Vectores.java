package ejemplos;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {

		int array1[];
		array1 = new int[5];

		for (int i = 0; i < 5; i++) {
			array1[i] = i;
		}
		int array2[];
		array2 = new int[] { 5, 6, 7, 8, 9, 10, 11 };

		int larray1 = array1.length;
		int larray2 = array2.length;

		System.out.println("longitud array 1 " + larray1);
		System.out.println("longitud array 2 " + larray2);

		/*
		 * larray1=larray2; System.out.println("longitud array 1 " + larray1);
		 * System.out.println("longitud array 2 " + larray2);
		 */

		int array[] = new int[array2.length];

		for (int i = 0; i < array2.length; i++) {
			array[i] = array2[i];
		}

		System.arraycopy(array1, 1, array2, 0, 3); // Origen y posicion, destino y la posicion y longitud a copiar

		System.out.println("Hola");

		int arraybd[][] = new int[2][3];

		arraybd[0][0] = 1;
		arraybd[0][1] = 2;
		arraybd[0][2] = 3;
		arraybd[1][0] = 4;
		arraybd[1][1] = 5;
		arraybd[1][2] = 6;

		System.out.println("Hola");

		Arrays.fill(array, 5);
		Arrays.fill(array, 1, 3, 2);
		System.out.println(Arrays.equals(array1, array2));
		Arrays.sort(array);

		System.out.println("Hola");

		int dondeestael10 = Arrays.binarySearch(array2, 10);
		int dondeestael5 = Arrays.binarySearch(array, 5);

		System.out.println("Hola");
	}
}