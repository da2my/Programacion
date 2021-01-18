package funciones.practica;

import java.util.Scanner;

//4- Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
//	int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
public class Ejercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("Escribe valor, te devolvera -1 si es negativo, 0 si es igual a 0, 1 si es positivo:");
		valor=sc.nextInt();
		System.out.println("Este valor es: "+dimeSigno(valor));
		sc.close();
	}

	static int dimeSigno(int a) {
		if (a < 0) {
			return -1;
		} else if (a > 0) {
			return 1;
		} else {
			return 0;
		}
	}

}
