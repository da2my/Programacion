package funciones.ejercicios;

import java.util.Scanner;

//Escribe una funci�n que muestre por pantalla un tri�ngulo como el del ejemplo. Deber� recibir
//dos par�metros: el car�cter que se desea imprimir y el n�mero de l�neas del tri�ngulo.
public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String caract;
		int altura;
		System.out.println("Introduzca altura de la piramide: ");
		altura = sc.nextInt();
		System.out.println("Introduzca caracter de relleno para la piramide: ");
		caract = sc.next();
		pintaTriangulo(caract, altura);
		sc.close();
	}

	static void pintaTriangulo(String caracter, int alturaTriangulo) {
		int base, lIzq, lDer;// c = 1
		base = (alturaTriangulo * 2) - 1;
		lIzq = base / 2;
		lDer = base / 2;
		for (int i = 0; i < alturaTriangulo; i++) {
			for (int j = 0; j < base; j++) {
				if ((j >= lIzq && j <= lDer)) {// (j == lIzq || j == lDer || j == c && !(i == 0) || (j >= lIzq && j <=
												// lDer))
					System.out.print(caracter);
				} else {
					System.out.print(" ");
				}
			}
			// c += 2;
			lDer++;
			lIzq--;
			System.out.println();
		}
	}
}