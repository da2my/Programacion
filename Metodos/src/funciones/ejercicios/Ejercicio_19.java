package funciones.ejercicios;

import java.util.Scanner;

//Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
//a la ecuaci�n de Pit�goras: x � + y � = z �. El programa solicita al usuario los valores x, y, z. Se
//deber� crear una funci�n a la que se le pase x, y, z y devuelva si son iguales o no.
//Por ejemplo: 3 � + 4 � = 5 �.
public class Ejercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		System.out.println("Escriba valores para comprobar esta ecuacion x � + y � = z �"+"\n"+"x: ");
		x=sc.nextDouble();
		System.out.println("y: ");
		y=sc.nextDouble();
		System.out.println("z: ");
		z=sc.nextDouble();
		sc.close();
		System.out.println(compPitagoras(x, y, z));
	}
	
	static boolean compPitagoras(double x, double y, double z) {
		double aux, result;
		aux=Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));
		result=Math.round(aux*100.0)/100.0;
		if (z==result) {
			System.out.println("Son iguales");
			return true;
		}else {
			System.out.println("No son iguales");
			return false;
		}
	}
}