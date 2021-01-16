package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
//productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
//int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
//int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
//double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n

public class Ejercicio_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entero;
		System.out.println("Escribe valor entero 'N': ");
		entero = sc.nextInt();
		System.out.println("El sumatorio de 1 - N: " + suma1aN(entero));
		System.out.println("El productorio de 1 - N: " + producto1aN(entero));
		System.out.println("El intermedio de 1 - N: " + intermedio1aN(entero));
		sc.close();
	}

	static int suma1aN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	static int producto1aN(int n) {
		int multi = 1;
		for (int i = 1; i <= n; i++) {
			multi *= i;
		}
		return multi;
	}

	static double intermedio1aN(int n) {
		double inter;
		inter = n / 2;
		return inter;
	}
}