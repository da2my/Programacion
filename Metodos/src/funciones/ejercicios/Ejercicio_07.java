package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que pida el ancho y alto de un rect�ngulo y muestre por pantalla su �rea y
//su per�metro. Implementa y utiliza las funciones:
//double perimetroRectangulo(double ancho, double alto) // Devuelve el per�metro
//double areaRectangulo(double ancho, double alto) // Devuelve el �rea
public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;
		System.out.println("Escriba la base del rectangulo: ");
		base=sc.nextDouble();
		System.out.println("Escriba la altura del rectangulo: ");
		altura=sc.nextDouble();
		System.out.println("El perimetro es: "+perimetroRectangulo(base, altura));
		System.out.println("El area es: "+areaRectangulo(base, altura));
	}

	static double perimetroRectangulo(double ancho, double alto) {
		double perimetro;
		perimetro=2*(ancho+alto);
		return perimetro;
	}
	
	static double areaRectangulo(double ancho, double alto) {
		double area;
		area=ancho*alto;
		return area;
	}
}
