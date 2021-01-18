package funciones.ejercicios;

import java.util.Scanner;

//Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
//Para ello implementa una función que reciba como parámetro un número entero y muestre por
//pantalla la tabla de multiplicar de dicho número.
public class Ejercicio_11 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Que tabla de multiplicar quieres?");
		n=sc.nextInt();
		System.out.println("La tabla de multiplicar del numero: " + n);
		tablaMultiplicar(n);
		sc.close();
	}

	static void tablaMultiplicar(int num) {
		int result;
		for (int i = 1; i <= 10; i++) {
			result = num * i;
			System.out.println(i + " x " + num + " = " + result);
		}
	}

}
