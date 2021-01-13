package matrices.ejerciciosC;

public class Ejercicio_02 {
//	Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
//	multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[10][10];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 1; i < filas; i++) {// Recorrido de las filas de la matriz
            System.out.println();
            for (int j = 1; j < columnas; j++) {// Recorrido de las celdas de una fila
                 System.out.print("Matriz[" + i + "][" + j + "]=" + matriz[i][j]);
                int mult = i*j;
                	matriz[i][j] = mult;
                System.out.print(matriz[i][j]+"|");
            }
        }
	}

}
