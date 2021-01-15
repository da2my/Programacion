package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es
//el mínimo. Implementa y utiliza la función:
//int minimo(int a, int b) // Devuelve el menor entre a y b
public class Ejercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Escribe primer numero: ");
		a=sc.nextInt();
		System.out.println("Escribe segundo numero: ");
		b=sc.nextInt();
		System.out.println("El minimo es: "+minimo(a, b));
		sc.close();
	}
	
	static int minimo(int a, int b) {
		return Math.min(a, b);
	}
}