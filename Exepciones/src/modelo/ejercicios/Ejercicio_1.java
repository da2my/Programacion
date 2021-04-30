package modelo.ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		try {
			System.out.println("Introduce valor: ");
			a = sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
