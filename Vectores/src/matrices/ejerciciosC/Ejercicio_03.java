package matrices.ejerciciosC;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int igual = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intorduce filas:");
		int n = sc.nextInt();
		System.out.println("Intorduce columnas:");
		int m = sc.nextInt();
		double[][] matriz = new double[n][m];
		int filas = matriz.length;
		int columnas = matriz[0].length;
		for (int i = 0; i < filas; i++) {// Recorrido de las filas de la matriz
			System.out.println();
			for (int j = 0; j < columnas; j++) {// Recorrido de las celdas de una fila
				// System.out.print("Matriz[" + i + "][" + j + "]=" + matriz[i][j]);
				System.out.println("Introduce valor en la fila: " + i + "\n" + "Introduce valor en la columna: " + j);
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] > 0) {
					max++;
				} else if (matriz[i][j] < 0) {
					min++;
				} else {
					igual++;
				}
			}
		}

		for (int i = 0; i < filas; i++) {// Recorrido de las filas de la matriz
			System.out.println();
			for (int j = 0; j < columnas; j++) {// Recorrido de las celdas de una fila
				// System.out.print("Matriz[" + i + "][" + j + "]=" + matriz[i][j]);
				System.out.print("|" + matriz[i][j] + "|");
			}
		}
		System.out.println("\n"+"Valores menores de 0: " + min + ", Valores mayores a 0: " + max + ", Valores iguales a 0:" + igual);
	sc.close();
	}
}
