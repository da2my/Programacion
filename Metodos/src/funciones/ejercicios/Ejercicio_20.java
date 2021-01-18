package funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio_20 {


	public static void main(String[] args) {

		menu();
	}

	static void menu() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (!(num >= 1 && num <= 10)) {
			System.out.println("Introduce el numero de la tabla de multiplicar que quieres: ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println(("la tabla del 1 es: "));
				muestraTabla(num);
				break;
			case 2:
				System.out.println(("la tabla del 2 es: "));
				muestraTabla(num);
				break;
			case 3:
				System.out.println(("la tabla del 3 es: "));
				muestraTabla(num);
				break;
			case 4:
				System.out.println(("la tabla del 4 es: "));
				muestraTabla(num);
				break;
			case 5:
				System.out.println(("la tabla del 5 es: "));
				muestraTabla(num);
				break;
			case 6:
				System.out.println(("la tabla del 6 es: "));
				muestraTabla(num);
				break;
			case 7:
				System.out.println(("la tabla del 7 es: "));
				muestraTabla(num);
				break;
			case 8:
				System.out.println(("la tabla del 8 es: "));
				muestraTabla(num);
				break;
			case 9:
				System.out.println(("la tabla del 9 es: "));
				muestraTabla(num);
				break;
			case 10:
				System.out.println(("la tabla del 10 es: "));
				muestraTabla(num);
				break;
			default:
				System.out.println(("Solo se hace las tablas del 1 - 10"));
				break;
			}
		}
		sc.close();
	}

	static void muestraTabla(int num) {
		for (int i = 1; i < 11; i++) {
			System.out.println((num + " x " + i + " = " + num * i));
		}
	}
}