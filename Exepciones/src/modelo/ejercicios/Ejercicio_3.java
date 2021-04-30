package modelo.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double array[] = new double[5];
		double a;

		for (int i = 0; i < array.length; i++) {
			try {
				System.out.println("Introduce valor: ");
				a = sc.nextDouble();
				array[i]=a;

			} catch (InputMismatchException e) {
				System.err.println("Valor erroneo, introduce uno valido: ");
				sc.nextLine();
				i--;/////////////////***USO***///////////////
			}
		}
		
		for (double d : array) {
			System.out.println(d);
		}
	}

}