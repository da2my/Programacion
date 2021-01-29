package vectores.busqueda;

import java.util.Arrays;

public class Binaria {
//	En este caso el vector debe estar ordenado. Se dividirá en dos para buscar el elemento en una
//	parte del vector o en otra y así sucesivamente hasta encontrar, o no, el elemento.
	public static void main(String[] args) {
		int[] array = new int[5];
		// Rellena el array con random
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		// Ordena array
		Arrays.sort(array);
		// Muestra array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out
				.println("La busqueda del valor indicado se encuentra en la posicion: " + busquedaDicotomica(array, 4));

	}

	public static int busquedaDicotomica(int[] v, int elemento) {
		int izq = 0;// El indice izquierdo se establece en la posicion 0
		int der = v.length - 1;// el indice derecho se establece en la ultima posicion
		int centro = (izq + der) / 2;// El incide central se establece en la posicion central
		int posicion;

		while (izq <= der && v[centro] != elemento) {
			if (elemento < v[centro]) {
				der = centro - 1;// si el elemento se menor que el centro cambiamos el inice "der"
			} else {
				izq = centro + 1;// sino cambiamos el indice "izq"
			}
			centro = (izq + der) / 2;// Actualizamos el centro
		}

		if (izq > der) {
			posicion = -1;
		} else {
			posicion = centro;
		}

		return posicion;
	}
}