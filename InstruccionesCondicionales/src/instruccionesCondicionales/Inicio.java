package instruccionesCondicionales;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void condicionMayor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero: ");
		int num;
		num = scan.nextInt();
		if (num > 10) {
			System.out.println("El numero es mayor que 10");
		} else if (num < 10) {
			System.out.println("El numero no es menor que 10");
		} else {
			System.out.println("El numero es igual que 10");
		}
	}

	public static void numMayor(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("De mayor a menor: " + num2 + ", " + num1);
		} else if (num1 > num2) {
			System.out.println("De menor a mayor: " + num1 + ", " + num2);
		} else {
			System.out.println("son iguales: " + num1 + ", " + num2);
		}
	}

	public static void password() {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce clave");
		int clave = 0;
		clave = scan.nextInt();
		if (clave == 8) {
			System.out.println("Clave correcta");
		} else {
			System.out.println("Clave incorrecta");
		}
	}

	public static void sumaNumMayor(int num1, int num2) {
	//		int aux=10;
			if (num1 > 10 & num2 > 10) {
				int suma = num1 + num2;
				System.out.println("La suma de estos 2 numeros es: " + suma);
			} else {
				System.out.println("No se puede sumar");
			}
		}

	public static void sumaParSinoDime(int num1, int num2) {
		if ((num1 % 2 == 0) & (num2 % 2 == 0)) {
			int suma = num1 + num2;
			System.out.println("La suma de estos 2 numeros es: " + suma);
		}else if() {
			
		}
	
	}

}
