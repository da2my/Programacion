package vectores.ejerciciosA;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[array1.length + array2.length];
		System.out.println("Escriba 20 numeros: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		
		System.arraycopy(array1, 0, array3, 0, array1.length);
		System.arraycopy(array2, 0, array3, array1.length, array2.length);
		
		System.out.println("El array1 y el array2 son iguales: ");
		System.out.println(Arrays.equals(array1, array2));
		
		System.out.println("Muestra array3");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]);
		}
	}
}
