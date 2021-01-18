package funciones.ejercicios;

import java.util.Scanner;

//Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
//elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
//tres) y nos devuelva el máximo de los dos valores.
public class Ejercicio_09 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Introduzca 3 valores: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		valorMax(num1, num2);
		if (valorMax(num1, num2)>num3) {
			System.out.println("El numero mayor es: " + valorMax(num1, num2));
		}else {
			System.out.println("El numero mayor es: "+ num3);
		}
		sc.close();

	}
	
	static double valorMax(double a, double b) {
		double max;
		max=Math.max(a, b);
		return max;
	}
}