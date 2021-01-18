package funciones.practica;

import java.util.Scanner;

//Realiza un programa que nos pida número enteros hasta que se introduzca el 0, 
//diciéndonos, para cada número introducido si es primo o no. Hay que recordar
//que un número es primo si es divisible por si mismo y por 1. El 1 no es primo
//por convenio. Se debe crear una función que pasándole un número entero devuelva
//si es primo o no.
public class Ejercicio_17 {

	public static void main(String[] args) {

		introNumCuentaPrimos();
	}

	static void introNumCuentaPrimos() {
		Scanner sc = new Scanner(System.in);
		int num = -1, cont = 0, cont1 = 0;
		while (num != 0) {
			System.out.print("Introduce numeros hasta que pongas 0: ");
			num = sc.nextInt();
			if (num != 2 && num != 3 && num != 5 && num != 7) {
				if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num == 1 || num == -1) {
					System.out.println("No es primo");
				} else {
					System.out.println("Es primo");
				}
			} else {
				System.out.println("Es primo");
			}
		}
		System.out.println(cont + cont1);
		sc.close();
	}

}
