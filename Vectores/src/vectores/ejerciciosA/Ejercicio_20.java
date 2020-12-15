package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[1000];
		int n, v;
		int cont = 0;
		boolean existe = false;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		System.out.println("Introduce valor: ");
		v=sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (v == array[i]) {
				existe = true;
				cont++;
			}
		}
		System.out.println("Este valor " + existe + " que existe" + "\n" + "y se repetite " + cont + " veces");

//		for (int i : array) {
//			System.out.println(i);
//		}
	}

}
