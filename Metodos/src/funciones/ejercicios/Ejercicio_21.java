package funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio_21 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		int circulo;
		boolean out=false;
		while (!out) {
		System.out.println(("\nElige una opción: \n1: Circunferencia \n2: Area \n3: Volumen \n4: Todas \n5: Salir"));
		circulo = sc.nextInt();
			switch (circulo) {
			case 1:
				System.out.printf("%1.2f", circunferencia(pideRadio()));
				break;

			case 2:
				System.out.printf("%1.2f", area(pideRadio()));
				break;

			case 3:
				System.out.printf("%1.2f", volumen(pideRadio()));
				break;
			case 4:
				for (double i : todas(pideRadio())) {
					System.out.printf("%1.2f",i);
					System.out.println();
				}
				break;
				
			case 5:
				out=true;
				break;

			default:
				System.out.println(("Opcion no valida"));
				break;
			}
		}
	}

	static double pideRadio() {
		System.out.println("Introduzca radio: ");
		return sc.nextDouble();
	}

	static double circunferencia(double r) {
		double c, d;
		d = 2 * r;
		c = Math.PI * d;
		return c;
	}

	static double area(double r) {
		double a;
		a = Math.PI * (Math.pow(r, 2));
		return a;
	}

	static double volumen(double r) {
		double v;
		v = (Math.PI) * 4 * (Math.pow(r, 3) / 3);
		return v;
	}
	
	static double[] todas(double r) {
		double c, d, a, v;
		d = 2 * r;
		c = Math.PI * d;
		a = Math.PI * (Math.pow(r, 2));
		v = (Math.PI) * 4 * (Math.pow(r, 3) / 3);
		double [] t= {c, a, v};
		return t;
	}
}