package matrices.ejerciciosC;

public class Ejercicio_01 {
//Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25 y
//luego muestre la matriz por pantalla.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] matriz = {{4, 3, 9}, {2, 1, 4}};
        int[][] matriz = new int[5][5];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {// Recorrido de las filas de la matriz
            System.out.println();
            for (int j = 0; j < columnas; j++) {// Recorrido de las celdas de una fila
                // System.out.print("Matriz[" + i + "][" + j + "]=" + matriz[i][j]);
                int ale = (int) (Math.random() * 25);
                	matriz[i][j] = ale;
                System.out.print(matriz[i][j]+"|");
            }
        }
	}

}
