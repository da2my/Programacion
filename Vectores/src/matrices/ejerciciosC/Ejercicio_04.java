package matrices.ejerciciosC;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		int numAlumnos = 4, numNotas = 5;
		pintaArray(numAlumnos, numNotas);
	}

	public static void pintaArray(int alumnos, int notas) {
		Scanner sc = new Scanner(System.in);
		double[][] cuadroNotas = new double[alumnos][notas];
		double max = 0;
		double min = 10;
		double media = 0;
		double aux = 0;
		for (int i = 0; i < alumnos; i++) {
			System.out.println();
			for (int j = 0; j < notas; j++) {
				System.out.print("Alumno: " + (i+1) + " Nota: " + (j+1)+":");
				cuadroNotas[i][j] = sc.nextDouble();
				if (cuadroNotas[i][j] > max) {
					aux += cuadroNotas[i][j];
					max = cuadroNotas[i][j];
				} else if (cuadroNotas[i][j] <= min) {
					aux += cuadroNotas[i][j];
					min = cuadroNotas[i][j];
				}
			}
			System.out.println("La nota maxima del alumno " + (i+1) + " es: " + max);
			System.out.println("La nota minima del alumno " + (i+1) + " es: " + min);
			media = aux / notas;
			System.out.println("La nota media del alumno " + (i+1) + " es: " + media);
		}
	}
}
