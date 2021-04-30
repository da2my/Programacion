package model;

import java.util.Random;

public class Tablero {

	private final String[][] campo = new String[][] { { " ", " ", " ", " ", " ", " ", " ", " " },
			{ " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
			{ " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
			{ " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
			{ " ", " ", " ", " ", " ", " ", " ", " " } };

	public Tablero() {

	}

	// Metodos
	public void pintaTablero() {
		int filas = 8;
		int columnas = 8;
		char l[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		int n = 8;
		for (char c : l) {
			System.out.print(" " + c);
		}
		System.out.println();
		for (int i = 0; i < filas; i++) {// Recorrido de las filas d e la matriz
			for (int j = 0; j < columnas; j++) {// Recorrido de las celdas de una fila
				if (j % 2 == 0) {
					if (i % 2 == 0) {
						System.out.print(" " + "#");
					} else {
						System.out.print(" " + " ");
					}
//					casillas = (i % 2 == 0) ? "@" : "#";
//					System.out.print(campo[i][j] + casillas);
				} else {
					if (i % 2 != 0) {
						System.out.print(" " + "#");
					} else {
						System.out.print(" " + " ");
					}
				}
			}
			System.out.println(" " + n--);
		}
	}

	public String consultaPosicion(String letra, int numero) {
		int columnas = 8;
		int comp;
		int clave = 0;
		String cLetras = "ABCDEFGH";
		String posicion = "";
		char[] l;
		l = cLetras.toCharArray();
		for (int i = 0; i < l.length; i++) {
			if (letra.toUpperCase().charAt(0) > l[i]) {
				clave++;
			}
		}
		comp = Math.abs(numero - columnas);
		String elem = campo[comp][clave];
		if (elem.equals("#")) {
			posicion = "Esta casilla es: " + "Blanco";
		} else {
			posicion = "Esta casilla es: " + "Negro";
		}

		return posicion;
	}

	public String[][] inicializaTablero() {// si pinto directamente en este metodo con print y poniendo
											// System.out.print(campo[i][j] + "#"); sale el tablero cuadrado perfecto
											// pero no cuardaria los valores que quiero

		int filas = campo.length;
		int columnas = campo[0].length;
		for (int i = 0; i < filas; i++) {// Recorrido de las filas d e la matriz

			for (int j = 0; j < columnas; j++) {// Recorrido de las celdas de una fila
				if (j % 2 == 0) {
					if (i % 2 == 0) {
						campo[i][j] = "#";
					} else {
						campo[i][j] = " ";
					}
//					casillas = (i % 2 == 0) ? "@" : "#";
//					System.out.print(campo[i][j] + casillas);
				} else {
					if (i % 2 != 0) {
						campo[i][j] = "#";
					} else {
						campo[i][j] = " ";
					}
				}
			}
		}
		return campo;
	}

	public String[][] inicializaPos() {// si pinto directamente en este metodo con print y poniendo
		// System.out.print(campo[i][j] + "#"); sale el tablero cuadrado perfecto
		// pero no cuardaria los valores que quiero

		int filas = campo.length;
		int columnas = campo[0].length;
		Random r = new Random();
		
		for (int i = 0; i < filas; i++) {// Recorrido de las filas d e la matriz

			for (int j = 0; j < columnas; j++) {// Recorrido de las celdas de una fila
				if (j % 2 == 0) {
					if (i % 2 == 0) {
						campo[i][j] = "#";
					} else {
						campo[i][j] = " ";
					}
				} else {
					if (i % 2 != 0) {
						campo[i][j] = "#";
					} else {
						campo[i][j] = " ";
					}
				}
			}
		}
		return campo;
	}
}
