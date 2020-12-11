package vectores.ejerciciosA;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		arrayPQ();
	}

	static void arrayPQ() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe primer valor: ");
		int p = sc.nextInt();
		System.out.println("Escribe segundo valor: ");
		int q = sc.nextInt();
		int aux;
		aux = p - q;

		int[] arrN = new int[Math.abs(aux)];// Necesario valor absoluto para que no se asigne al array un valor negativo
		for (int i : arrN) {
			int aux1 = (p < q) ? p++ : q++;// linea de codigo genial para un if ternario que necesitaba. revisar!!
			arrN[i] = aux;
			System.out.println(aux1);
		}
	}
}
