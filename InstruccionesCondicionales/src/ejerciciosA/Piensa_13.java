package ejerciciosA;

import java.util.Scanner;

public class Piensa_13 {

	public static void main(String[] args) {
		adivina();
	}

	public static void adivina() {
		Scanner sc = new Scanner(System.in);
		int a = 50;
		int x = 0;
		String posibilidad;
		boolean check = true;
		while (check) {
			System.out.println("Este es tu numero " + a + "?" + " (Escribe correcto si lo es!!)");// dentro de bucle while
			posibilidad = sc.next();
			if (posibilidad.equalsIgnoreCase("menor")) {
				if (a == 50 || a > 25 && a < 50) {// inicial
					x = a + 25;
					a = x / 2;
				} else if (a > 1 && a <= 25) {
					x = a + 1;
					a = x / 2;
				}
				if (a > 50 && a < 75) {
					x = a + 50;
					a = x / 2;
				} else if (a > 75 && a < 100) {
					x = a + 75;
					a = x / 2;
				}

			} else if (posibilidad.equalsIgnoreCase("mayor")) {
				if (a == 50 || a > 50 && a < 74) {// inicial
					x = a + 75;
					a = x / 2;
				} else if (a >= 74 && a < 100) {
					x = a + 100;
					a = x / 2;
				}
				if (a > 25 && a < 50) {
					x = a + 50;
					a = x / 2;
				} else if (a > 1 && a < 25) {
					x = a + 25;
					a = x / 2;
				}
			}else if(posibilidad.equalsIgnoreCase("correcto")) {
				check=false;
			}
		}
	}
}