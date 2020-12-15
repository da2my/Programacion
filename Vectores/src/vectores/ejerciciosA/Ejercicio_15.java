package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;
		System.out.println("Intro tamaño de array");
		n = sc.nextInt();
		int[] contValor = new int[n];
		System.out.println("Intro contenido del array");
		m = sc.nextInt();
		for (int i = 0; i < contValor.length; i++) {
			contValor[i] = m;
		}
		for (int i : contValor) {
			System.out.println(contValor[i]);
		}
	}

}
