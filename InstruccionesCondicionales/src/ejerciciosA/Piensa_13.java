package ejerciciosA;

import java.util.Scanner;

public class Piensa_13 {

	public static void main(String[] args) {
		adivina();
	}

	public static void adivina() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Piensa un numero!!");
		double a = 50;
		double aux = 1;
		double cuarto = 25;
		String posibilidad;
		while (true) {
			System.out.println("Este es tu numero " + (int) a + "?");// dentro de bucle while
			posibilidad = sc.next();
			if (posibilidad.equalsIgnoreCase("menor")) {
				aux-=25;
				a = (a + aux) / 2;
				if (a == 0) {
					a = 1;
				}
			} else if (posibilidad.equalsIgnoreCase("mayor")) {
				aux+=25;
				a = (aux + a) / 2;
				if (a > 100) {
					a = 100;
				}
			}
		}
	}
}