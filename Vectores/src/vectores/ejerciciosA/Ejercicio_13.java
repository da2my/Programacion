package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v;
		int i = 0;
		int rell = 0;
		System.out.println("De que tamaño va a ser tu secunecia?");
		int[] arr = new int[sc.nextInt()];
		int[] arrS = new int[arr.length];
		System.out.println("valor inicial de la secuencia aritmetica: ");
		v = sc.nextInt();
		System.out.println("Valor de incremento de la secuncia: ");
		i = sc.nextInt();
		for (int j = v; j < arr.length; j += i) {
			arr[j] = j;
			System.out.println(arr[j]);
		}

	}

}
