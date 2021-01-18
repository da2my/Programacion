package funciones.practica;

import java.util.Scanner;

//El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
//0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
//Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se deberá crear una función a la que se le pase el número y devuelva la letra.
//Ejemplo: para el DNI 56321122 el NIF es ‘X’.
public class Ejercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dni;
		System.out.println("Introduzca numeros del DNI para verificar la letra asociada: ");
		dni = sc.nextInt();
		System.out.println("La letra de este DNI es: " + compDNI(dni));

		sc.close();
	}

	static String compDNI(int dni) {
		String l[] = { "0", "T", "1", "R", "2", "W", "3", "A", "4", "G", "5", "M", "6", "Y", "7", "F", "8", "P", "9",
				"D", "10", "X", "11", "B", "12", "N", "13", "J", "14", "Z", "15", "S", "16", "Q", "17", "V", "18", "H",
				"19", "L", "20", "C", "21", "K", "22", "E" };
		String letra = "";
		String r;
		int resto = 0;

		resto = dni % 23;
		r = Integer.toString(resto);
		for (int i = 0; i < busquedaSecuencial(l, r) + 2; i++) {
			letra = l[i];
		}
		return letra;
	}

	public static int busquedaSecuencial(String[] v, String elemento) {
		int j, posicion = -1;
		for (j = 0; j < v.length && posicion == -1; j++) {
			if (v[j].equals(elemento)) {
				posicion = j;
			}
		}
		return posicion;
	}
}
