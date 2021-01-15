package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
//o no. Implementa y utiliza la función:
//boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Que edad tienes?");
		a=sc.nextInt();
		System.out.println(esMayorEdad(a));
		sc.close();
	}

	static boolean esMayorEdad(int a) {
		if (a>=18) {
			return true;
		}else {
			return false;
		}
	}
}