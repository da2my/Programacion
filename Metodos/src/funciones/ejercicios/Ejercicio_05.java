package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida un valor entero en millas y muestre su equivalente en kil�metros.
//Recuerda que una milla son 1,60934 kil�metros. Implementa y utiliza la funci�n:
//double millas_a_kilometros(int millas) // Devuelve la conversi�n de millas a kil�metros
public class Ejercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int millas;
		System.out.println("Escribe millas a convertir a km:");
		millas = sc.nextInt();
		System.out.println(millas_a_kilometros(millas) + "Km");
		sc.close();
	}

	static double millas_a_kilometros(int millas) {
		double km;
		km = millas * 1.60934;
		return km;
	}

}
