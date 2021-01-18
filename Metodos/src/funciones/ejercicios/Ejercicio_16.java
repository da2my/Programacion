package funciones.ejercicios;

import java.util.Scanner;

//Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
//valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
//valores aleatorios.
public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tArr;
		System.out.println("Introduzca tamaño del array: ");
		tArr=sc.nextInt();
		rellArrayAle(tArr);
		sc.close();
	}
	
	static void rellArrayAle(int arr) {
		int [] array = new int[arr];
		int al;
		for (int i : array) {
			al=(int)(Math.random()*101);
			array[i]=al;
			System.out.println(array[i]);
		}	
	}
}