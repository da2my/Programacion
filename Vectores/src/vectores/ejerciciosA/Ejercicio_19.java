package vectores.ejerciciosA;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ranking = new int[8];
		System.out.println("Introduzca 8 puntuaciones entre (1000 y 2800): ");
		for (int i = 0; i < ranking.length; i++) {
			ranking[i] = sc.nextInt();
		}

		Arrays.sort(ranking);

		for (int i = ranking.length - 1; i >= 0; i--) {// aqui no estoy mostrando el orden del array sino el orden desde
														// donde van a empezar a pintarse. Empieza por el valor
														// perteneciente al valor ranking[7] que es el mayor porque como
														// estan ordenados gracias al metodo sort() se pintaran a la
														// inversa
			System.out.println("	" + ranking[i]);
		}
	}

}
