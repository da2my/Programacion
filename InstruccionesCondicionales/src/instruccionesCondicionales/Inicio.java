package instruccionesCondicionales;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		condicionMayor();
//		numMayor(num1, num2);
//		password();
//		sumaNumMayor(num1, num2);
//		sumaParSinoDime(num1, num2);
//		escribe10();
//		escribe10de2en2();
//		entreNum();
//		sumaEntreNum();
//		repiteClave();
		
	}

	public static void condicionMayor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero: ");
		int num;
		num = scan.nextInt();
		if (num > 10) {
			System.out.println("El numero es mayor que 10");
		} else if (num < 10) {
			System.out.println("El numero es menor que 10");
		} else {
			System.out.println("El numero es igual que 10");
		}
		scan.close();
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
		if (clave == 777) {
			System.out.println("Clave correcta");
		} else {
			System.out.println("Clave incorrecta");
		}
		scan.close();
	}

	public static void sumaNumMayor(int num1, int num2) {
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
		} else if (num1 % 2 != 0 | num2 % 2 != 0) {
			if (num1 % 2 == 0) {
				System.out.println(num1 + " Este numero es par");
			} else {
				System.out.println(num1 + " Este numero es impar");
			}
			if (num2 % 2 == 0) {
				System.out.println(num2 + " Este numero es par");
			} else {
				System.out.println(num2 + " Este numero es impar");
			}
		}
	}

	public static void escribe10() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
	
	public static void escribe10de2en2() {
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
	}
	
	public static void entreNum() {
		Scanner scan = new Scanner(System.in);
		int num1, num2, aux;
		System.out.println("Introduzca primer numero: ");
		num1 = scan.nextInt();
		System.out.println("Introduzca segundo numero: ");
		num2 = scan.nextInt();
		if (num1 < num2) {
			System.out.println("El Primer numero introducido es menor");
			aux = num2 - num1;
			while (aux != 0) {
				aux = aux - 1;
				num1 = num1 + 1;
				System.out.println(num1);
			}
		} else {
			System.out.println("El Primer numero introducido es mayor");
		}
		scan.close();
	}

	public static void sumaEntreNum() {
		int aux;
		int it;
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca primer numero: ");
		num1 = scan.nextInt();
		System.out.println("Introduzca segundo numero: ");
		num2 = scan.nextInt();
		aux = 0;
		it = 0;
		if (num1 < num2) {
			aux = num2 - num1;
			while (aux != 1) {
				aux = aux - 1;
				num1 = num1 + 1;
				it = it + num1;
				System.out.println(num1);
			}
			System.out.println(
					"La suma total de los numeros comprendidos entre los introducidos por el usuario es: " + it);
		} else {
			aux = num1 - num2;
			while (aux != 1) {
				aux = aux - 1;
				num1 = num1 - 1;
				it = it + num1;
				System.out.println(num1);
			}
			System.out.println(
					"La suma total de los numeros comprendidos entre los introducidos por el usuario es: " + it);
		}
		scan.close();
	}

	public static void repiteClave() {
		Scanner scan = new Scanner(System.in);
		String clave;
		boolean cond;
		System.out.println("Introduzca clave");
		clave = scan.next();
		cond = false;
		if (clave.equals("davo")) {
			System.out.println("Clave correcta");
		} else {
			while (cond == false) {
				System.out.println("Clave incorrecta, intenta de nuevo");
				clave = scan.next();
				if (clave.equals("davo")) {
					cond = true;
				}
			}
			System.out.println("Clave correcta");
		}
		scan.close();
	}

}
