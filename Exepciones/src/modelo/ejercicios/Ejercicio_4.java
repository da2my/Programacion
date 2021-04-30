package modelo.ejercicios;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int x;
		int temp = 0;
		boolean bucle = true;
		int[] arr = rellenaVector();

		do {
			try {
				System.out.println("Que posicion quieres ver??");
				x = sc.nextInt();
				if (x != -1) {
					System.out.println(Array.getInt(arr, x));
				} else {
					temp = x;
					System.err.println("Bye");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("¡¡¡Desbordamiento del dato random al crear en Array!!!");
				System.out.println("-Intenta de nuevo-");
				sc.nextLine();
				
			} catch (IndexOutOfBoundsException e) {
				System.err.println("¡¡¡Desbordamiento del dato random al crear en Array!!!");
				System.out.println("-Intenta de nuevo-");
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.err.println("¡¡¡Dato erroneo!!!");
				System.out.println("-Intenta de nuevo-");
				sc.nextLine();
			} finally {
				bucle = (temp < 0) ? false : true;
			}
		} while (bucle);

	}

	public static int[] rellenaVector() throws IndexOutOfBoundsException {
		int n;
		int m = 0;
		n = (int) (Math.random() * 100);
		int[] vecAleatorio = new int[n];
		for (int i = 0; i < vecAleatorio.length; i++) {
			m = (int) (Math.random() * 10);
			vecAleatorio[i] = m;
		}
		System.out.println("-El vector y sus elementos han sido creados-\n(Si quieres salir introduce -1)");
		return vecAleatorio;
	}

}
