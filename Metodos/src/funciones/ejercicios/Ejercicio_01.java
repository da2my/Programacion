package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida dos n�meros reales por teclado y muestre por pantalla el
//resultado de multiplicarlos. Implementa y utiliza la funci�n:
//double multiplica(double a, double b) // Devuelve la multiplicaci�n de dos n�meros
public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: "+multiplica());
	}
	
	static double multiplica() {
		Scanner sc = new Scanner(System.in);
		double resultado, a, b;
		System.out.println("Escribe primer numero: ");
		a=sc.nextDouble();
		System.out.println("Escribe segundo numero: ");
		b=sc.nextDouble();
		resultado=a*b;
		return resultado;
	}

}
