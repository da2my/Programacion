package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {

		arrayNM();
	}
	
	static void arrayNM() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe tamaño de vector: ");
		int n=sc.nextInt();
		System.out.println("Escribe valor a rellenar: ");
		int m=sc.nextInt();
		
		int[]arrN = new int[n];
		for (int i : arrN) {
			arrN[i]=m;
			System.out.println(arrN[i]);
		}
		
		
	}
	
	

}
