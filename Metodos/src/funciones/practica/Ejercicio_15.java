package funciones.practica;

//Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
//Luego muestra la suma total y la media. Implementa una función que calcule la suma de un array
//y otra que calcule la media de un array.
public class Ejercicio_15 {

	public static void main(String[] args) {
		int[] array = new int[101];
		System.out.println(
				"La suma del array: " + sumaArray(array) + "\n" + "Media del array: " + mediaArray(sumaArray(array)));
	}

	static double sumaArray(int[] arr) {
		double sum = 0;
		int j=0;
//		for (int i = 1; i < arr.length; i++) {
//			arr[i] = i;
//			sum += arr[i];
//		}
		for (int i : arr) {
			arr[i] = j;
			sum += arr[i];
			j++;
		}
		return sum;
	}

	static double mediaArray(double sumArr) {
		double med;
		med = sumArr / 100;
		return med;
	}

}
