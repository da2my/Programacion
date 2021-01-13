package vectores.busqueda;

public class Secuencial {
//	La búsqueda secuencial consiste en comparar los elementos del
//	vector con el elemento a buscar. Un ejemplo es el siguiente, 
//	donde se devuelve la posición del elemento en el vector y si no lo
//	encuentra, devuelve el valor -1:
	public static void main(String[] args) {
		int [] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10);
			System.out.println(array[i]);
		}
		System.out.println("La busqueda del valor indicado se encuentra en la posicion: "+busquedaSecuencial(array, 4));			
		
	}

	public static int busquedaSecuencial(int[] v, int elemento) {
		int j, posicion = -1;
		for (j = 0; j < v.length && posicion == -1; j++) {
			if (v[j] == elemento) {
				posicion = j;
			}
		}
		return posicion;
	}

}
