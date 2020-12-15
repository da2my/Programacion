package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double g, aux, sum, valor;

		System.out.println("Intro limite de la secuencia");
		valor = sc.nextDouble();
		sum = valor + 1;
		aux = sum / 2f;
		g = aux * valor;

		int[] serie = new int[(int) g];
		int cont = 0;
		// La presmisa que se ve en el enunciado nos da la idea de que es una secunecia
		// que si lo vemos como una forma geometrica pinta un triangulo rectangulo. Por
		// ello que usamos 2 for anidados para hacer que cada it. del primer for pinte
		// las filas, en nuestro caso las repeticiones de cada numero y el segundo for
		// se repiteen su respectiva fila el numero de veces del numero seleccionado por
		// el primer for
		for (int i = 0; i <= valor; i++) {// For se encarga de hacer la secuencia de Gauss
			for (int j = 0; j < i; j++) {
				serie[cont] = i;
				cont++;
			}
		}
		System.out.print("Array: ");
		for (int i = 0; i < serie.length; i++) {
			System.out.print(serie[i]);
		}
	}

}
