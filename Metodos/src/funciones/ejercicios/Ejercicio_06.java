package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
//uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
//double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
public class Ejercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price1, price2, price3, price4, price5;
		System.out.println("Introduce precio 1: ");
		price1 = sc.nextDouble();
		System.out.println("Introduce precio 2: ");
		price2 = sc.nextDouble();
		System.out.println("Introduce precio 3: ");
		price3 = sc.nextDouble();
		System.out.println("Introduce precio 4: ");
		price4 = sc.nextDouble();
		System.out.println("Introduce precio 5: ");
		price5 = sc.nextDouble();
		System.out.println("Precio pasados por teclado, añadido el IVA del 21%: ");
		System.out.println(precioConIVA(price1));
		System.out.println(precioConIVA(price2));
		System.out.println(precioConIVA(price3));
		System.out.println(precioConIVA(price4));
		System.out.println(precioConIVA(price5));
		sc.close();
	}

	static double precioConIVA(double precio) {
		double resultado;
		resultado = precio + (precio * 0.21);
		return resultado;
	}

}
