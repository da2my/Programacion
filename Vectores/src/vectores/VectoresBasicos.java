package vectores;

import java.util.Arrays;

public class VectoresBasicos {

	public static void main(String[] args) {

//		1- Crear un array1 unidimensional de enteros de longitud 10 y rellenarlo con los números que van del 10 al 20.
		System.out.println(
				"1- Crear un array1 unidimensional de enteros de longitud 10 y rellenarlo con los números que van del 10 al 20.");
		int[] array1 = new int[10];
		int cont1 = 10;
		for (int i = 0; i < array1.length; i++) {
			cont1++;
			array1[i] = cont1;
			System.out.print(cont1 + " ");
		}
		System.out.println();
//		2- Crear un array2 unidimensional de enteros de longitud 20 y rellenarlo con los números que van del 20 al 1.
		System.out.println(
				"2- Crear un array2 unidimensional de enteros de longitud 20 y rellenarlo con los números que van del 20 al 1.");
		int[] array2 = new int[20];
		int cont2 = 20;
		for (int i = 0; i < array2.length; i++) {
			cont2--;
			array2[i] = cont2;
			System.out.print(cont2 + " ");
		}
		System.out.println();
//		3.- Crea un array3 unidimensional de longitud 30 rellenarlo con los 20 elementos del array 1 seguidos de los 10 elementos del array2.
		System.out.println(
				"3.- Crea un array3 unidimensional de longitud 30 rellenarlo con los 20 elementos del array 1 seguidos de los 10 elementos del array2.");
		int[] array3 = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, array3, 0, array1.length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		for (int i : array3) {
			System.out.print(i + " ");
		}
		System.out.println();
//		4.- Ordena el array3
		System.out.println("4.- Ordena el array3");
		Arrays.sort(array3);// ordena
		for (int i : array3) {
			System.out.print(i + " ");
		}
		System.out.println();
//		5.- Busca la posición en la que se encuentra el número 5 en el array3
		System.out.println("5.- Busca la posición en la que se encuentra el número 5 en el array3");
		System.out.print(Arrays.binarySearch(array3, 5));
		System.out.println();
//		6.- Rellena en el array2 desde la posición 5 a la posición 8 con el numero 99
		System.out.println("6.- Rellena en el array2 desde la posición 5 a la posición 8 con el numero 99");
		Arrays.fill(array2, 5, 9, 99);
		for (int i : array2) {
			System.out.print(i + " ");
		}
		System.out.println();
//		7.- Copia en el array1 desde la posición 0, los 6 primeros elementos del array2﻿
		System.out.println("7.- Copia en el array1 desde la posición 0, los 6 primeros elementos del array2﻿");
		System.arraycopy(array2, 0, array1, 0, 7);
		for (int i : array1) {
			System.out.print(i + " ");
		}
		
	}
}
