package matrices.ejerciciosC;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int employe;
		System.out.println("Cuantos empleados tiene la empresa");
		employe=sc.nextInt();
		mediaGeneros(employe);
		sc.close();
	}

	public static void mediaGeneros(int empleados) {
		Scanner sc = new Scanner(System.in);
		double[][] tabla = new double[empleados][2];
		int contH = 0, contM = 0, g;
		double sueldo, sueldoH = 0, sueldoM = 0;
		boolean genero = false;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					do {
						System.out.print("Introduzca '1' si es Mujer y '0' si es Hombre: ");
						g = sc.nextInt();
						if (g == 0) {
							contH++;
							genero = true;
						} else if (g == 1) {
							contM++;
							genero = false;
						} else {
							System.out.println("El valor introducido es incorrecto");
						}
					} while (g != 0 && g != 1);//tener cuidado con las condiciones de un loop
				} else {
					System.out.println("Introduce sueldo de esta persona: ");
					sueldo = sc.nextDouble();
					tabla[i][j] = sueldo;
					if (genero == false) {
						sueldoM += tabla[i][j];
					} else if (genero == true) {
						sueldoH += tabla[i][j];
					}
				}
			}
		}
		System.out.println("El sueldo medio de las Mujeres es: " + (sueldoM / contM) + "\n"
				+ "El sueldo medio de los Hombres es: " + (sueldoH / contH));
		sc.close();
	}
}